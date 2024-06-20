package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Emp {
    private static final String FILE_NAME = "employees.properties";

    public static void main(String[] args) {
        Properties properties = new Properties();
        Scanner scanner = new Scanner(System.in);
        loadProperties(properties);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert/Update Employee");
            System.out.println("2. Select Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insertOrUpdateEmployee(properties, scanner);
                    break;
                case 2:
                    selectEmployee(properties, scanner);
                    break;
                case 3:
                    deleteEmployee(properties, scanner);
                    break;
                case 4:
                    saveProperties(properties);
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void loadProperties(Properties properties) {
        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            properties.load(fis);
            System.out.println("Loaded employee data.");
        } catch (IOException e) {
            System.out.println("No existing data found. Starting fresh.");
        }
    }

    private static void saveProperties(Properties properties) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            properties.store(fos, "Employee Data");
            System.out.println("Employee data saved.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static void insertOrUpdateEmployee(Properties properties, Scanner scanner) {
        System.out.print("Enter Employee Number: ");
        String empNo = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        properties.setProperty(empNo, empName);
        System.out.println("Employee inserted/updated successfully.");
    }

    private static void selectEmployee(Properties properties, Scanner scanner) {
        System.out.print("Enter Employee Number: ");
        String empNo = scanner.nextLine();
        String empName = properties.getProperty(empNo);
        if (empName != null) {
            System.out.println("Employee Number: " + empNo);
            System.out.println("Employee Name: " + empName);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void deleteEmployee(Properties properties, Scanner scanner) {
        System.out.print("Enter Employee Number: ");
        String empNo = scanner.nextLine();
        if (properties.remove(empNo) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
