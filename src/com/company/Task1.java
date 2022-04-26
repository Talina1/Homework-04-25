package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    void makarena(){
        System.out.println();
        System.out.println("Welcome to task 1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text");
        String userInput = scanner.nextLine();

        String replacedUserInput = userInput.replace(",", "-MAKARENA");
        System.out.println(replacedUserInput);

    }
}
