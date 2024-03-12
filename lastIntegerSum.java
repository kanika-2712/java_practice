
// Adding one to the last element in array by treating the whole array as single integer.
import java.math.BigInteger;

public class lastIntegerSum {
 
    public static void main(String[] args) {
      int arr[]={1,2,3,4};
      
      String s="";
      for(int i=0;i<arr.length;i++){
          s=s+arr[i];
      }
     BigInteger num=new BigInteger(s);
     BigInteger sum=num.add(BigInteger.ONE);
     String sums=sum+"";
     int res[]=new int[sums.length()];
     
     for(int i=0;i<sums.length();i++)
    {
        res[i]=Integer.parseInt(sums.substring(i,i+1));
    }    
     
     for(int j=0;j<sums.length();j++){
         System.out.print(res[j]);
    }
     

    }
}

    

