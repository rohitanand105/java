import java.util.*;

public class stock_buy_sell_2 {
    public static void main(String args[]){
        int prices[]  = new int[6];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<prices.length; i++){
            System.out.println("Enter the value of array");
            prices[i] = scan.nextInt();
            
        }
        
        for(int i = 2; i<prices.length; i++){
            if( prices[1] <= prices[i]){
                System.out.print(prices[i] - prices[4]);
                break;              
            }else{
                System.out.print("0");
            }

        }
        

        scan.close();


    }
}
