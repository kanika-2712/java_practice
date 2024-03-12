import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class waveArray {
   
        public static void main(String args[]) {
            ArrayList<Integer> A = new ArrayList<>();
            A.add(1);
            A.add(2);
            A.add(3);
            A.add(4);

           
            Collections.sort(A);
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<A.size()-1;i=i+2){
                int tp=A.get(i);
                A.set(i,A.get(i+1));
                A.set(i+1,tp);
            }
           System.out.println(A);
        }
    }

