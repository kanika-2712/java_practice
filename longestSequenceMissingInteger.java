


import java.util.ArrayList;
import java.util.*;
public class longestSequenceMissingInteger {
    
   


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

