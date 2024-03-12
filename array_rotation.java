<<<<<<< HEAD
//rotating array with the number of elements specified
=======


 
>>>>>>> fe959e6264c321fb33fb5662f3eee7444f1b6fee

class array_rotation {
    public static void main(String[] args) {
      
        int[] arr = {1,2,3,4,5};
       
        int n =2;
        
        while(n!=0){
            int j=arr.length-1;
            int temp=arr[j];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        n--;
        }
        
        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
<<<<<<< HEAD
        }      
=======
        }
       
       
       
        
>>>>>>> fe959e6264c321fb33fb5662f3eee7444f1b6fee
       
    }
}
