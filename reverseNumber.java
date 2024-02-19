import java.util.*;
import java.io.*;
public class reverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            //rev=0;
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        
        System.out.print(rev);

    }
}
