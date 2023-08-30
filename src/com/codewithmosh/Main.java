package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    final byte  PERCENT = 100;
    final byte MONTHS_IN_A_YEAR = 12;
    
    System.out.print("Principal: ");
    int principal = scanner.nextInt();
    
    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    
    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();
    int numberOfPayments = years * MONTHS_IN_A_YEAR;
    
    float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_A_YEAR;
    
    double mortgage = principal
        * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
        / Math.pow((1 + monthlyInterest), numberOfPayments) - 1;
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    
    System.out.printf("Mortgage: %s", mortgageFormatted);
    
    
  }
}