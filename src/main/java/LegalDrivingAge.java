/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */


import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println((age < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive");
    }
}
