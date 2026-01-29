package com.GUI;

import java.util.Scanner;
import com.services.EmployeeManagementServices;
import com.aspect.ObjectCreator;
import com.bean.Employee;

public class ClientCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        EmployeeManagementServices ems = ObjectCreator.createObject();

        int id;
        String name;
        double salary;

        do {
            System.out.println("\n============================");
            System.out.println(" EMPLOYEE MANAGEMENT SYSTEM ");
            System.out.println("============================");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    salary = sc.nextDouble();

                    ems.addEmployee(id, name, salary);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    Employee emp = ems.searchByID(id);
                    if (emp != null) {
                        System.out.println("Employee Found:");
                        System.out.printf("%-10s %-20s %-10s%n", "EmpId", "EmpName", "Salary");
                        System.out.println("-------------------------------------------");
                        System.out.printf("%-10d %-20s %-10.2f%n", emp.geteId(), emp.geteName(), emp.getSalary());
                    } else {
                        System.out.println("Employee with ID " + id + " not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    System.out.print("Enter new Salary: ");
                    salary = sc.nextDouble();
                    boolean updated = ems.updateByID(id, salary);
                    if (updated) {
                        System.out.println("Employee salary updated successfully!");
                    } else {
                        System.out.println("Employee with ID " + id + " not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();
                    boolean deleted = ems.deleteEmployee(id);
                    if (deleted) {
                        System.out.println("Employee deleted successfully!");
                    } else {
                        System.out.println("Employee with ID " + id + " not found!");
                    }
                    break;

                case 5:
                    ems.displayEmployee(); // assume displayEmployee prints table format
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
