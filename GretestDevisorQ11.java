
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class GretestDevisorQ11 {
    
    public static void main(String[] args) {
        
        
        Scanner input=new Scanner(System.in);
        System.out.println("Insert divisible  ");
        int num1=input.nextInt();
        
        System.out.println("Insert divisor % ");
        int num2=input.nextInt();
        
//        int num1=60;
//        int num2=24;
//        
        int rem;
       while(num2!=0){
        
        rem=num1%num2;
        num1=num2;
        num2=rem;
     
       }
        System.out.println("Gretest devisor = "+num1);
        
        
        
    }
    
    
}
