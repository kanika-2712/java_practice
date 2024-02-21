
// /*In the theory of numbers, square free numbers have a special place.  
// A square free number is one that is not divisible by a perfect square (other than 1).  Thus 72 is divisible by 36 (a perfect square), and is not a square free number, but 70 has factors 1, 2, 5, 7, 10, 14, 35 and 70.  
// As none of these are perfect squares (other than 1), 70 is a square free number.
// For some algorithms, it is important to find out the square free numbers that divide a number. 
// Note that 1 is not considered a square free number. 
// In this problem, you are asked to write a program to find the number of square free numbers that divide a given number.*/

// //import java.io.*;
import java.util.*;




public class squareFreeNumber {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[]={2,3,5,7,11,13,17,19};
         int count=0;
         for(int i:arr){
            if(n%i==0){
                count++;
            }
         }
         System.out.println((int)Math.pow(2,count)-1);

//         int res = solve(n);
//         System.out.print(res);

//     }
//     public static int solve(int n) {
//         int count = 0;

//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0) {
                

//                 if (divisibleByperfectSquare(i)) {
//                     count++;


//                 }
//             }

//         }
//         return count;
//     }

//     public static boolean divisibleByperfectSquare(int num) {
//         boolean flag = true;
//         for (int j = 2; j <= num; j++) {
//             if (num % j == 0) {
//                 if (Math.sqrt(j) == Math.floor(Math.sqrt(j))) {
//                     flag = false;
//                 }
//             }
//         }
//         return flag;

   }

}
