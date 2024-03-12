
import java.util.*;
public class solution {
    

    public static int solve(ArrayList<Integer> A, int B, int C) {
        
        int count=0;
        String s="";
        int len=B;
        if(B==1){
            for(int i=0;i<A.size();i++){
                if(A.get(i)>C){
                    count++;
                }
            }
            return count;
        }
        
        for(int j=0;j<A.size();j++){
            for(int i=0;i<A.size();i++)
        { 
            if(A.get(j)!=0){
            while(len>1){
            
                s=s+A.get(j)+""+A.get(i)+"";
                len--;
            }
            
            
            
             int n= Integer.parseInt(s);
               if(n>C){
                count++;
               }
            }     
        
        }
        s="";
        
        //int num=A.get(j)+A.get(i);
       // if(num != A.get(j) || num!=A.get(i)){
           
        //}
    
         
        
                  
    }
     return (count);   
    }
    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(5);
        int B=2;
        int C= 21;
        int res=solve(list,B,C);
        System.out.println(res);
    }
    
    
}




