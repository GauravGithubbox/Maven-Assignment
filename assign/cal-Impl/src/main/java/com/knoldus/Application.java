package com.knoldus;
import java.util.*;


public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //we are making the object of calculator class
        Scanner sc = new Scanner(System.in);
int firstNum, SecondNum;        
System.out.println("Enter two numbers=> ");
        firstNum = sc.nextInt();
        SecondNum = sc.nextInt();
        System.out.println("Addition of two number is-> "+ calculator.addition(firstNum, SecondNum));
        System.out.println("Subtraction of two number is "+ calculator.subtraction(firstNum, SecondNum));
        System.out.println("Multiplication of two number is "+ calculator.multiplication(firstNum, SecondNum));
        System.out.println("Devision of two number is "+ calculator.division(firstNum, SecondNum));
        System.out.println();
        sc.close();
    }
}