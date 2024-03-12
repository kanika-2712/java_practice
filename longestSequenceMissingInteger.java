

<<<<<<< HEAD
//explanation:[0,1,3,4,5,7,8] output should be 3 since 3,4,5 has longest squence before occurence of missing integer
=======
>>>>>>> fe959e6264c321fb33fb5662f3eee7444f1b6fee

import java.util.ArrayList;
import java.util.*;
public class longestSequenceMissingInteger {
<<<<<<< HEAD
=======
    
   

>>>>>>> fe959e6264c321fb33fb5662f3eee7444f1b6fee

    public static void main(String[] args) {
       int arr[]={0,2,4,5,5,5,5,1,6,7,8,9,10};
       
       ArrayList<Integer> list = new ArrayList<>();
       
       for(int i:arr)
       {
           list.add(i);
           
       }
       
       Collections.sort(list);
       int max =0;
       int count=0;
       int j=0;
       
       for(int i=0;i<=list.get(list.size()-1);i++){
          if(i==list.get(j)){
              count++;
          } 
          else{
              if(i-1==list.get(j)){
                  count++;
                  //j--;
                  i--;
              }else{
              count=0;
              j--;
              }
          }
          if(count>max){
             max=count;
           
       }
       
       j++;
       }
       System.out.print(max);
    }
}

