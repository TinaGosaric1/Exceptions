package com.tg;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example2 {
    static StringBuilder myMessage = new StringBuilder();

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");
        }
        System.out.println(myMessage.replace(0, myMessage.length(), "x is ").append(x).append(", y is ").append(y));
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }

    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println(myMessage.replace(0, myMessage.length(), "Please enter an integer "));
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e){
                // go round again. Read past the end of line in the input first
                s.nextLine();
                System.out.println(myMessage.replace(0, myMessage.length(), "Please enter a number using only the digits 0 to 9 "));
            }
        }
    }
}
