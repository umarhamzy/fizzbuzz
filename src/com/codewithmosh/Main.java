package com.codewithmosh;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String fizz = "Fizz";
    String buzz = "Buzz";
    
    String exitInput = "pass";
    
    while (!exitInput.equals("quit")) {
        System.out.print("Number: ");
        int number = scanner.nextInt();
        
        if (number % 5 == 0 && number % 3 == 0) {
          System.out.println(fizz + buzz);
        }
        else if (number % 3 == 0) {
          System.out.println(buzz);
        }
        else if (number % 5 == 0) {
          System.out.println(fizz);
        } else {
          System.out.println(number);
        }
    }
    System.out.println("Press ENTER to continue, or type \"quit\" to exit");
    exitInput = scanner.nextLine().toLowerCase();
    System.out.println("Thank you for playing!");
  }
}