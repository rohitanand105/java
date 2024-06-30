class A{
    public void meth2(){
        System.out.println("This is Super class");
    }

}

class B extends A{
    public void meth2(){
        System.out.println("This is Sub Class");
    }
}
public class ovri {
    public static void main(String args[]){
        A m = new A();
        B t = new B();
        m.meth2();
        t.meth2();
        



    }
}
