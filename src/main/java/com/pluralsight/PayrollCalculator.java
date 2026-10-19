package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
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

        double totalPay = 0;
        if (hoursWorked > 40){
            double overTime = hoursWorked - 40;
            double overTimePay = payRate * 1.5;
            totalPay = 40 * payRate;
            totalPay += overTimePay * overTime;
        } else {
            totalPay = hoursWorked * payRate;
        }


        System.out.printf("Name: %s%nGross Pay: %.2f%n", name, totalPay);


    }
}
