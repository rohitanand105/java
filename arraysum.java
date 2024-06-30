import java.util.*;


public class arraysum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        

        
        int a[] = new int[5];
        System.out.println("Enter the values for array: ");
        for(int i= 0; i<a.length; i++){
            a[i] = s.nextInt();



        }
        int c = 10;
        for(int i = 1; i<a.length; i++){
            // int t = a[i];
            for(int j=1; j<a.length;){
                if(a[i] + a[j] == c){
                    System.out.println("YES");
                }
                
                else{
                    System.out.println("NO");
                    
                }
                break;

            }
        }
        s.close();
        
        
    }
}
