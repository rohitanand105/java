public class palin {
    public static void main(String args[]){
        String a = "radar";

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) == a.charAt(a.length() - i)){
                System.out.print("Palindrome");
            }
        }
    }
}
