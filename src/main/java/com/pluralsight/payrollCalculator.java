package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // prompt for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();
        input.nextLine();

        // prompt for pay
        System.out.print("Enter your pay rate: ");
        double payRate = input.nextDouble();
        input.nextLine();

        System.out.printf("Name: %s%nGross Pay: %.2f%n", name, (hoursWorked * payRate));


    }
}
