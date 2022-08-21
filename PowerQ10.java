
package com.java.core51.problemsov4thmonth;

import java.util.Scanner;


public class PowerQ10 {
    
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("input the base");
        int n= input.nextInt();
        System.out.println("Input Power Number");
        int p= input.nextInt();
        int result=1;
        
        for (int i = 1; i <=p; i++) {
            result*=n;
        }
        System.out.println(n +"^"+p+" = "+ result);
        
        
    }
    
}
