
package com.java.core51.problemsov4thmonth.classtest;

import java.util.Scanner;


public class Q4_MaxMin {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
     //   System.out.println("Insert the length");
      //  int len= input.nextInt();
  int []arr= new int[3];
        for (int i = 0; i <3; i++) {
            System.out.print("Number " + i+1 +" : ");
            arr[i]=input.nextInt();
            
        }
        //max
            int max=arr[0];
        
        for (int i = 0; i <arr.length; i++) {
        if(max<arr[i]){
            max=arr[i];
        }
            
        }
        System.out.println("Max Number is " + max);
     
        //min
        int min=arr[0];
        for (int q = 0; q <arr.length; q++) {
            if(min>arr[q]){
            min = arr[q];
                    }
            
        }System.out.println("Min number is " + min);
        
        
        
    }
    
}
