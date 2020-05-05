package com.calculator;

import java.util.*;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int flag=0,ch;
        int num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("");
            System.out.println("1) Addition");
            System.out.println("2) Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==2)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Addition");
                        System.out.println("Enter two numbers");
                        System.out.print("Enter number 1: ");
                        num1 = reader.nextInt();
                        System.out.print("Enter number 2: ");
                        num2 = reader.nextInt();
                        System.out.println(add(num1,num2));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
}
