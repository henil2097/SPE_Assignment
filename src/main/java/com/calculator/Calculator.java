package com.calculator;

import java.util.*;

public class Calculator {
    public static int mul(int a, int b){ return a*b; }
    public static int div(int a, int b){
        return a/b;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){ return a-b; }

    public static void main(String[] args) {
        if(args.length!=0 && args.length==3){
            int num1 = Integer.parseInt(args[0]);
            String op = args[1];
            int num2 = Integer.parseInt(args[2]);

            switch(op){
                case "*":
                    System.out.println(mul(num1,num2));
                    break;
                case "/":
                    System.out.println(div(num1,num2));
                    break;
                case "+":
                    System.out.println(add(num1,num2));
                    break;
                case "-":
                    System.out.println(sub(num1,num2));
                    break;
                default: System.out.println("Exiting program due to invalid input");
            }
        }
        else{
            System.out.println("Exiting program due to invalid input");
        }

    }
}
