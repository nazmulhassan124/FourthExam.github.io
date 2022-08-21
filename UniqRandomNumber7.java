
package com.java.core51.problemsov4thmonth;

public class UniqRandomNumber7 {
    
     int dup[] = new int[10];
    int count = 0, dupcount = 0;
    void generateDuplicate() {
        int randomvalue = 0;
        for (;;) {
            randomvalue = (int) (Math.random() * 100);
            if(duplicateCheck(randomvalue)==1){
            dup[count]=randomvalue;
                System.out.print(dup[count]+" ");
                count++;
            }
            if(count==10){
            break;
            }
        }
        System.out.println("");
    }

    int duplicateCheck(int x) {
        for (int i = 0; i < 10; i++) {
            if(dup[i]==x){
            dupcount++;
            return 0;
            }
        }
        return 1;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
       
        UniqRandomNumber7  rn = new UniqRandomNumber7();
        rn.generateDuplicate();
    }
            
        }
        
    

