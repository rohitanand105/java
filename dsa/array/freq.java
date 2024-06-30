package dsa.array;



public class freq {
    public static void main(String args[]){
        int a[] = {1,1,1,2,2,3};
        
        for (int i = 0; i<a.length;i++){
            if( a.length == 0){
                System.out.println(a[i]);
            }
            else{
                if(a[i] == a[i+1]){
                    i = i+1;
                    


                }
            }
            System.out.println(a[i]);
        }
    }
}
