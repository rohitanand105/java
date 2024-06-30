package extra;
import java.math.BigInteger;

class factorial{
    long fact(long n){
        long result;

        if (n==1) return 1;
        result = fact(n-1)*n;
        return result;
    }
    
}

public class recur {
    public static void main(String args[]){
        BigInteger bigInteger = new BigInteger("123456789123456789123456798");
        factorial f = new factorial();

        System.out.println("Factorial of 3 is : "+ f.fact(3));
        System.out.println("Factorial of 4 is : "+ f.fact(4));
        System.out.println("Factorial of 5 is : "+ BigInteger.f.fact(30));

    }   
    
}
