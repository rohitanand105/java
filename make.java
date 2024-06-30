import java.util.*;




public class make {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scanner.nextInt();



        int array[]  = new int[size];
        System.out.println("Enter the values of the array: ");
        for(int i = 0; i<size; i++){
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for(int i = 1; i<size; i++){
            if(array[i]> max){
                max = array[i];
            }
        }

        System.out.println("the largest number is " + max);

        scanner.close();
        



        
    }
}
