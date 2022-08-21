
package com.java.core51.problemsov4thmonth;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayShortQ6 {
    
    
       
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("insert lenght");
        int len= input.nextInt();
         int[] arr2= new int[len];
        for (int i = 0; i <len; i++) {
            System.out.print("insert numbers   ");
            
            arr2[i]=input.nextInt();
        }
        
        

        
        /*--------Arrys short assending---*/
        Arrays.sort(arr2);
        System.out.print("Assending : ");
        for (int i = 0; i <arr2.length; i++) {
            System.out.print(arr2[i] +",");
            
        }
        System.out.println("  ");
        
        /*----Desending-----*/
            System.out.print("Dessending : ");

        for (int i = 4; i >=0; i--) {
            System.out.print(arr2[i]+",");
            
        }
        System.out.println("");
    }
    
}
