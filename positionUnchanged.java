//when a string is reverse how many character do not change its position
import java.io.*;
import java.util.*;

class positionUnchanged {
    public static int pallindrom(String str){ 
        int len=str.length();
        int count=0;
    for(int i=0,j=len-1;i<len;i++,j--){
        if(str.charAt(i)==str.charAt(j)){
            count++;
            
        }
        
    }
    return count;
    
    }

	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String str= sc.nextLine();
	  
	 
	   System.out.print(pallindrom(str));
	    
	    }
	    
	   
	}