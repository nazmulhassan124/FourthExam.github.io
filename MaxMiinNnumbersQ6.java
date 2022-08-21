
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class MaxMiinNnumbersQ6 {
    
    public static void main(String[] args) {
        
        Scanner input = new  Scanner(System.in);
        System.out.println("How many number do you Insert ");
        int len = input.nextInt();   //lenght input
        int[]arr2=new int[len];      //arry create 
        
        //inser n number in array
        for (int i = 0; i <len; i++) {
            System.out.print("Insert number "+ i+1 +" : ");
            arr2[i]=input.nextInt();
        }
     /* for( int x: arr2){
          System.out.print(x+ " , ");
      }System.out.println(" ");  */
        
        /*--Max number---*/
        int max =arr2[0];
        
        for (int i = 1; i <arr2.length; i++) {
             if(max<arr2[i]){
                 max=arr2[i];
                 
             }
        }
                 System.out.println("Maximum number is : "+ max);
        
        /*--Min number---*/
        int min =arr2[0];
        
        for (int i = 1; i <arr2.length; i++) {
             if(min>arr2[i]){
                 min=arr2[i];
             }
        }
                 System.out.println("Minimum number is : "+ min);
        
        
        
    }
    
    
}
