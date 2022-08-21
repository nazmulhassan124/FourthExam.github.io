
package com.java.core51.problemsov4thmonth.classtest;

import java.util.Scanner;


public class Q1_PrimeNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert a Integer Number : ");
        int num= input.nextInt();
        int count=0;
       
       if(num<=1){
           
           System.out.println(num + " is NOt a  prime number");
       
       }else if(num==2){
          System.out.println(num + " is a prime number"); 
       }else{
           
     for (int i = 2; i < num; i++) {
          if(num%i==0){
          count++;
          
               }  
            }
      if(count==1){
            System.out.println(num + " is not prime");
        }else{
            System.out.println(num+ " is prime");
        }
    }
    }
 
}
