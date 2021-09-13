/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String password, passTry, user;

        System.out.print("Enter a username: ");
        user = scnr.next();
        System.out.print("Create a password: ");
        password = scnr.next();

        System.out.println("\nYour username is: " + user);

        System.out.print("What is the password? ");
        passTry = scnr.next();

        if (passTry.equals(password)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
