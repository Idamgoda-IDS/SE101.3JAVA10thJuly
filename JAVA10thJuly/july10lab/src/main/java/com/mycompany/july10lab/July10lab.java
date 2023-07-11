package com.mycompany.july10lab;

import java.util.Scanner;
public class July10lab {

    public static void main(String[] args) {
       
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
        
        try
        {
            System.out.println("Enter first number: ");
            n1=sc.nextInt();
            System.out.println("Enter second number: ");
            n2=sc.nextInt();
            ans=n1/n2;
            System.out.println("Answer is "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number divided by Zero"+e);
        }
   }
}

