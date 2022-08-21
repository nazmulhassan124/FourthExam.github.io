package com.java.core51.problemsov4thmonth;

import java.util.Scanner;

public class PrimeNumberQ6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inter a positive integer");
        int num = input.nextInt();

        int count = 0;
        if (num < 2) {
            System.out.println("This is not prime");
        } else if (num == 2) {
            System.out.println("This is prime");
        } else {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println("This is not prime");
            } else {
                System.out.println("This is  prime");
            }

        }

    }

}
