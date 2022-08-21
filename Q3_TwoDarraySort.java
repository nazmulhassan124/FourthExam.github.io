
package com.java.core51.problemsov4thmonth.classtest;


public class Q3_TwoDarraySort {
    
    public static void main(String[] args) {
  
    int [][] arr= {{1,99,91,11,44},{0,10,9,9,11},{3,23,21,5,20},{11,0,1,20,56}};
    //print array
        System.out.println("the array is");
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  " );
            }
            System.out.println(" ");
            
        }
        
        //Sort Array
        System.out.println("   ");
        System.out.println(" Assending sort is ");
        
        int temp;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                for (int k =j+1; k <arr[i].length; k++) {
                    
                    if(arr[i][j]>arr[i][k]){
                    temp=arr[i][j];
                    arr[i][j]=arr[i][k];
                    arr[i][k]=temp;
                }
                    
                }
              System.out.print(arr[i][j] + "  " );  
            }
            System.out.println(); 
        }
        System.out.println();
      
        
// Print sorted array
        
/*      
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  " );
            }
            System.out.println(" ");
        
    }
        */
    
    } 
}
