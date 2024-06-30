package extra;
public class inherit {
    float salary = 40000;

}

class Programmer extends inherit{
    int bonus = 10000;
    public static void main(String args[]){
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bouns of Programmer is "+ p.bonus);
    }
}
