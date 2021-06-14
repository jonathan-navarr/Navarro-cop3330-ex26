package org.example;
import java.util.Scanner;
import  java.lang.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class PaymentCalculator {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("What is your balance? ");
        double b;
        b = sc.nextDouble();
        System.out.println(b);

        System.out.print("What is the APR on the card (as a percent)? ");

        double i;
        i = sc.nextDouble();
        System.out.println(i);

        i = (i/100)/365;


        System.out.print("What is the monthly payment you can make ?");
        double p;
        p = sc.nextDouble();
        System.out.println(p);

        double numofMonths;
        numofMonths = calculateMonthsUntilPaidOff(p, i, b);
        System.out.println("It will take you " + Math.round(numofMonths+1) + " months to pay off this card.");


    }
    public static double calculateMonthsUntilPaidOff(double p, double i, double b){
        double numofMonths;
        double power = Math.pow((1+i),30);
        numofMonths = -(1) * (Math.log(1+((b*(1-power))/p)));

        numofMonths = numofMonths / 30;
        numofMonths = numofMonths / (Math.log(1+i));

        return numofMonths;


    }
}
