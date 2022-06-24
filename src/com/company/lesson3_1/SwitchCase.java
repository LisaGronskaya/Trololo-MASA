package com.company.lesson3_1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-5): ");

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2 :
                System.out.println("Number is 2");
                break;
            case 3 :
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
        sc.close();
    }
}
