

import java.util.ArrayList;
public class vowel_replacement {
   


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

    

