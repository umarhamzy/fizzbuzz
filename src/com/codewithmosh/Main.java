package com.codewithmosh;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String fizz = "Fizz";
    String buzz = "Buzz";
    
    System.out.print("How many times do you want to run the program? \nType a value less than or equal to 7: ");
    int numberOfInput = scanner.nextInt();
    
    while (numberOfInput > 0 && numberOfInput <= 7) {
      for (int i = 0; i <= numberOfInput && numberOfInput > 0; i++) {
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
        numberOfInput--;
      }
    }
    System.out.println("Thank you for playing!");
  }
}