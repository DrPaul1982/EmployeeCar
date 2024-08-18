package src.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the position: ");
        String position = scanner.nextLine();
        System.out.print("Enter the e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Enter the phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        Employee employee = new Employee(name, position, email, phone, age);

        System.out.println(employee.employeeInfoOut());
    }
}

