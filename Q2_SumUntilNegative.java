
package com.java.core51.problemsov4thmonth.classtest;

import java.util.Scanner;


public class Q2_SumUntilNegative {
    
    
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        System.out.println("Insert the value");
        int sum=0;
        
        for (int i = 0; i < 100; i++) {
            int num=input.nextInt();
          
           if(num<0){
           break;
           }
           sum+=num;
           
            
        }
        System.out.println("Sum of the values = " +sum);
        
    }
    
    
    
}
