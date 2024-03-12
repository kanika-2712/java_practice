
import java.util.*;
public class recursiveDigitSum {
    public static void main(String[] args) {
       
        String n="148";
        int k=3;
        int num=0;
        for(int i=0;i<n.length();i++){
            num=num+Integer.parseInt(n.substring(i,i+1));
         }
         int ans=num*k;
         int sum=0;
         while(ans >0 ){
             int rem=ans%10;
             sum=sum+rem;
             ans=ans/10;
             if(ans==0 && sum>10){
                 ans=sum;
                 sum=0;
             }
         }
         System.out.println(sum);
    }
}
