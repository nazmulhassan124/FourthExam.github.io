
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class SumUntilZero8 {
    static int sum=0;
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Input numbers");
        
        
         
        for (int i = 0; i < 10; i++) {
            int num= input.nextInt();
            
            if(num>0){
            sum+=num;
            }
            if(num<0){
            sum+=num;
            }
            if(num==0){
            break;
            }
            }
        System.out.println(" Total sumation of number"+sum);
            
            
        }
    }
    

