
<<<<<<< HEAD
// this program demonstrates the solution for replacing vowels
//every vowel in the word is extracted and replace each vowel in its reverse order.
import java.util.ArrayList;
public class vowel_replacement {
=======

import java.util.ArrayList;
public class vowel_replacement {
   


>>>>>>> fe959e6264c321fb33fb5662f3eee7444f1b6fee
    public static void main(String[] args) {
        
       String str = "CoimbatOre";
       
       String result = "";
       
       char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
       
       ArrayList<Character> list = new ArrayList<>();
       
       for (char ch : arr) {
           list.add(ch);
       }
       
       String res = "";
       for (int i = 0; i < str.length(); i++) {
           if (list.contains(str.charAt(i))) {
               res += str.charAt(i);
           }
       }
       
       StringBuilder reversed = new StringBuilder(res);
       String rev = reversed.reverse().toString();
       
       int j = 0;
       for (int i = 0; i < str.length(); i++) {
           if (list.contains(str.charAt(i))) {
               result += rev.charAt(j);
               j++;
           } else {
               result += str.charAt(i);
           }
       }
       
       System.out.print(result);
    }
}

    

