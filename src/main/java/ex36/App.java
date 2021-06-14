/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex36;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double minimum, maximum, average, standardDeviation;
        Scanner input = new Scanner(System.in);
        String userInput = "";
        ArrayList <Double> numbers = new ArrayList();
        while(!userInput.toLowerCase(Locale.ROOT).equals("done")) {
            System.out.print("Enter a number: ");
            userInput = input.next();
            if(InputValidator.isNumeric(userInput))
                numbers.add((double) Integer.parseInt(userInput));
        }
        System.out.print("Numbers: ");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            System.out.print(" ");

        }
        System.out.println("\nAverage: " + Statistic.average(numbers));
        System.out.println("Minimum: " + Statistic.min(numbers));
        System.out.println("Maximum: " + Statistic.max(numbers));
        System.out.println("Standard Deviation: " + Statistic.std(numbers));
    }
}
