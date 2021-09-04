/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Ashley
 */

import java.util.Scanner;


public class Solution04 {

    /*
    prompt user to enter a noun
    read input into noun variable
    prompt user to enter a verb
    read input into verb variable
    prompt user to enter an adjective
    read input into adjective variable
    prompt user to enter an adverb
    read input into adverb variable
    print a mad lib involving these variables
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();

        System.out.printf("The %s %s has spoken. %s your buff and %s exit", adjective, noun, verb, adverb);
    }




}
