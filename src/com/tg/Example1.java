package com.tg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    static StringBuilder myMessage = new StringBuilder();

    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x,y));
        System.out.println(divideEAFP(x,y));

        int a = getIntEAFP();
        System.out.println(myMessage.append("a is ").append(a));

    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        StringBuilder input = new StringBuilder();
        input.append(s.next());
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(String.valueOf(input));
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) { // look before you leap
        if(y != 0){
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) { // easier to ask forgiveness than permission
        try{
            return x / y;
        } catch(ArithmeticException e){
            return 0;
        }
    }
}