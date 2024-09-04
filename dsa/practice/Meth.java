class There {

    public String There() {
        System.out.println("constructor called");
        
    }

}

public class Meth {

    public static void main(String[] args) {
        There m = new There();
        System.out.println(m);  // This will now print a meaningful message
    }
}
