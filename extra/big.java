package extra;
import java.math.*;
import java.util.*;

class Main {
public
  static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   long n = input.nextLong();
  System.out.println(fact(n));
 }
public
 static BigInteger fact(long n) {
    BigInteger result = BigInteger.ONE;
     for (int i = 1; i <= n; i++)      
     result = result.multiply(BigInteger.valueOf(i));       
     return result;
 }
}
