
package com.java.core51.problemsov4thmonth;

//import java.util.Arrays;


public class MultiArraySort {
    
    public static void main(String[] args) {
          int [][]arr1={{10,7,55,25},{17,15,3,35}};
          

         /*   Array print like matrix*/ 
          for (int i = 0; i <arr1.length; i++) {
              for (int j = 0; j <arr1[i].length; j++) {
                  System.out.print(arr1[i][j] + " , ");
              }System.out.println(" ");
            
        }
          System.out.println("Sorted Array ");
          /*2D Arraay short bellow */
          int n= arr1.length;
          int temp;
          for (int i = 0; i <n; i++) {
              for (int j = 0; j <arr1[i].length; j++) {
                  for (int k =j+1; k <arr1[i].length; k++) {
                     
                          if(arr1[i][j]>arr1[i][k]){
                          temp=arr1[i][j];
                          arr1[i][j]=arr1[i][k];
                          arr1[i][k]=temp;
                          }
                      }
                      System.out.print(arr1[i][j] + " , ");
                  }
                  System.out.println(" ");
              }
            
        
          
         /* 
          for (int i = 0; i <n; i++) {
              for (int j = 0; j <arr1[i].length; j++) {
                  System.out.print(arr1[i][j] +" , ");
              }
          System.out.print(" ");
          }
            
        }
          
          */
          
         
          
          
//          Arrays.sort(arr1);
//          System.out.println(arr1);
//          
    }
    
}
