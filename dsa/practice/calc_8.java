import java.util.*;


public class calc_8{
    public static void main(String args[]) throws Exception{
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers: \n");
        int a = scan.nextInt();
        int b = scan.nextInt();


        // System.out.println("Addition of these numbers = ");
        // System.out.print(a+b);

        System.out.println("What operation you want to perform on these numbers: ");
        System.out.print(" For addition press 1 \n For multiplication press 2\n For Subtraction press 3\n For division press 4\n ");
        int q = scan.nextInt();
        
        switch(q){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a*b);
                break;
            case 3:
                System.out.println(a-b);
                break;
            case 4:
                System.out.println(a/b);
                break;

        }





        scan.close();


        
    }
}