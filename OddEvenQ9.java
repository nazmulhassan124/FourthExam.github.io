
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class OddEvenQ9 {
    
 
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Insert the lenght number");
        int num=  input.nextInt();
       // System.out.println(num);
         int[]arr1=new int[num +1];
       
     
        for (int i = 0; i <=num; i++) {
            arr1[i]=i;
            
        }
        
       /* for (int i = 0; i <arr1.length; i++) {
                System.out.println(arr1[i]);
        }*/
        
        
        for (int i = 1; i <arr1.length; i++) {
        //Even Number
            if (i%2==0){    
             System.out.println(i +" =  Even ");
         } 
            //odd number
         if (i%2!=0){
             System.out.println(i +" =  Odd ");
         } 
         
        }
        
        
       
       
        
        
        
    }
    
    
    
    
}
