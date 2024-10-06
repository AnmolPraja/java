package org.example;

import org.example.models.Event;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static final String url = "jdbc:sqlite:event_calendar.db";

    public static void main(String[] args) {
        initializeDatabase();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Edit Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addEvent(scanner);
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    editEvent(scanner);
                    break;
                case 4:
                    deleteEvent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeDatabase() {
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            String createTableQuery = "CREATE TABLE IF NOT EXISTS events (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "title TEXT NOT NULL," +
                    "description TEXT," +
                    "dateTime TEXT NOT NULL" +
                    ")";
            statement.executeUpdate(createTableQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addEvent(Scanner scanner) {
        System.out.print("Enter event title: ");
        String title = scanner.nextLine();

        System.out.print("Enter event description: ");
        String description = scanner.nextLine();

        LocalDateTime dateTime = LocalDateTime.now();

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO events (title, description, dateTime) VALUES (?, ?, ?)")) {

            preparedStatement.setString(1, title);
            preparedStatement.setString(2, description);
            preparedStatement.setString(3, dateTime.toString());
            preparedStatement.executeUpdate();

            System.out.println("Event added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewEvents() {
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM events")) {

            System.out.println("Events:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                LocalDateTime dateTime = LocalDateTime.parse(resultSet.getString("dateTime"), dateTimeFormatter);

                Event event = new Event(id, title, description, dateTime);
                System.out.println(event);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void editEvent(Scanner scanner) {
        viewEvents();
        System.out.print("Enter the ID of the event to edit: ");
        int eventId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM events WHERE id = ?")) {

            preparedStatement.setInt(1, eventId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String currentTitle = resultSet.getString("title");
                String currentDescription = resultSet.getString("description");
                LocalDateTime currentDateTime = LocalDateTime.parse(resultSet.getString("dateTime"), dateTimeFormatter);

                System.out.println("Current Event Details:");
                System.out.println("Title: " + currentTitle);
                System.out.println("Description: " + currentDescription);
                System.out.println("Date and Time: " + currentDateTime);

                System.out.println("\nEnter new details:");

                System.out.print("Enter new event title: ");
                String newTitle = scanner.nextLine();

                System.out.print("Enter new event description: ");
                String newDescription = scanner.nextLine();

                System.out.print("Enter new event date and time (YYYY-MM-DD HH:mm): ");
                String newDateTimeString = scanner.nextLine();
                LocalDateTime newDateTime = LocalDateTime.parse(newDateTimeString, dateTimeFormatter);

                preparedStatement.close();

                try (PreparedStatement updateStatement = connection.prepareStatement(
                        "UPDATE events SET title = ?, description = ?, dateTime = ? WHERE id = ?")) {

                    updateStatement.setString(1, newTitle);
                    updateStatement.setString(2, newDescription);
                    updateStatement.setString(3, newDateTime.toString());
                    updateStatement.setInt(4, eventId);

                    updateStatement.executeUpdate();

                    System.out.println("Event updated successfully!");
                }

            } else {
                System.out.println("Event with ID " + eventId + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteEvent(Scanner scanner) {
        viewEvents();
        System.out.print("Enter the ID of the event to delete: ");
        int eventId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM events WHERE id = ?")) {

            preparedStatement.setInt(1, eventId);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Event deleted successfully!");
            } else {
                System.out.println("Event with ID " + eventId + " not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}