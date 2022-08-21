
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class FactorialNnumber2 {
    
  static int a=1;  
  static int temp=1;
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Length");
        int num= input.nextInt();
        //System.out.println(num);
        
        
        for (int i = 1; i <= num; i++) {
            
             temp *=i;
        }
            System.out.println("Factorial of " + num +" = "+temp); 
        
        
        
    }
    
    
}
