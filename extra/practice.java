package extra;
public class practice {
    public static void main(String args[]){
        // System.out.println("Hello World");
        int n = 10034;
        
        int temp=n;
        int reverse=0;
        while(n != 0){
            temp = n%10;
        reverse = (reverse * 10) + temp;
            n = n/10;
            
        }
        System.out.println("new "+ reverse);

    }
}