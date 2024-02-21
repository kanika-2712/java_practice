
//     A product code will be given like"aAbcdfkaj"count n will be given find the sum of AScii values of those product code .
// if n=3
// Take aAb then add the ascii values.here "a" occurs twice so 2*ascii

import java.io.*;
import java.util.*;

class productCode {
    public static int productcode(String str,int n){ 

    int len=str.length();
    int count=0;
    int res=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<len;j++){
            if(str.charAt(i)==str.charAt(j))
            count++;
            
        }
        int val=str.charAt(i);
        res=res+val*count;
        count=0;
        
    }
    return res;
    }
    
    
  
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String str= sc.nextLine();
	   int n=sc.nextInt();
	  
	 
	   System.out.print(productcode(str,n));
	    
	    }
	    
	   
	}

