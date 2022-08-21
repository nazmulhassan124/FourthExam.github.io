
package com.java.core51.problemsov4thmonth;


public class FibonacciNumber1 {
    
    static int a=0;
    static int b=1;
    static int temp;
    public static void main(String[] args) {
        
        System.out.println("Fibonacci Number");
        System.out.println("0 ,");
    
        for (int i = 0; i < 10; i++) {
            
            temp = a+b;
            System.out.println(temp+ ", ");
            
            a=b;
            b=+temp;
            
        }
 
        
    }
    
    
}
