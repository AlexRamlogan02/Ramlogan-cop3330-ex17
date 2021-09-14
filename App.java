package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    private static double val1 = 5.14;
    private static double val2 = 0.015;
    private static double maxBAC = 0.08;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double BAC, totalAlc, bodyWeight, alcDis, numHours;
        double parentheses, subtract, numer, denom;
        int sex;
        System.out.print(" Enter a 1 if you are male, or 2 if you are a female. : ");
        sex = scan.nextInt();
        if (sex == 1) //male
        {
            alcDis = 0.73;
        }
        else //female
        {
            alcDis = 0.66;

        }

        System.out.print("How many ounces of alcohol did you have? : ");
        totalAlc = scan.nextDouble();
        numer = totalAlc * val1;
        System.out.print("What is your weight, in pounds? : ");
        bodyWeight = scan.nextDouble();
        denom = bodyWeight * alcDis;
        System.out.print("How many hours has it been since your last drink? : ");
        numHours = scan.nextDouble();
        subtract = val2 * numHours;

        parentheses = numer/denom;
        BAC = parentheses - subtract;

        System.out.print("your BAC is " +BAC);
        if (BAC >= maxBAC)
        {
            System.out.println("It is not legal for you to drive");
        }
        else{
            System.out.println("\nIt is legal for you to drive.");
        }


    }
}
