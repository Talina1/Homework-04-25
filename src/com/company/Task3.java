package com.company;

import java.util.Scanner;

public class Task3 {
    void invert(){
        System.out.println();
        System.out.println("Welcome to Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text");
        String text = scanner.nextLine();
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        System.out.println(reverse);
        }
    }

