import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class stringFrequency {
    public static void main(String args[]){
        String A="abbhuabcfghh";
        String str="";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<A.length();i++){
            set.add(A.charAt(i));
        }
        ArrayList<Character> list1 = new ArrayList<>(set);
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<A.length();i++){
            map.put(A.charAt(i),map.getOrDefault(A.charAt(i),0)+1);
            
        }
       
        for( Character ch : list1){
            str=str+ch+map.get(ch);
        }
        System.out.println(list1);
        System.out.println(map);
        System.out.print(str);
        
    }
}
