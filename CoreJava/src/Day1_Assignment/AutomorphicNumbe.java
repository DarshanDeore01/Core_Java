package Day1_Assignment;

import java.util.Scanner;

//
//  Write a Java Program to accept a 2-digit number and check whether it is Automorphic or not.
//  Automorphic number: A number is said to be automorphic if and only if its square ends with the same digits as the number itself.
// Example: 25 -> square = 625, ends with 25 -> Automorphic number

public class AutomorphicNumbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 2-digit number:");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 99) { // Checking if the number is a 2-digit number
            int square = num * num;
            String strNum = String.valueOf(num);
            String strSquare = String.valueOf(square);

            // Checking if the square ends with the same digits as the number itself
            if (strSquare.endsWith(strNum)) {
                System.out.println(num + " is an Automorphic number.");
            } else {
                System.out.println(num + " is not an Automorphic number.");
            }
        } else {
            System.out.println("Please enter a valid 2-digit number.");
        }

        scanner.close();
    }
}
