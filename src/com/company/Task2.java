package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    void wordCounter() {

        System.out.println();
        System.out.println("Welcome to task 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text");

        String userInput = scanner.nextLine();
        userInput = userInput.replace(",","");

        String lowerCase = userInput.toLowerCase();

        String words[] = lowerCase.split("\\s");

        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < words.length; i++){
            arr.add(words[i]);
                }
        while (arr.size() != 0){
            String word = arr.get(0);
            int frequency = Collections.frequency(arr, word);
            arr.removeAll(Collections.singleton(word));
                System.out.println(word + " - " + frequency) ;
            }
        }
    }


