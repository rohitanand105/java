class A {
    int a;

    int rohit() {
        return 4;
    }

    public void meth2() {
        System.out.println("This is method 2 of class A ");
    }
}

class B extends A {

    public void meth2(){

        System.out.println("This is method 2 of class B");

    }

    public void meth3() {
        System.out.println("This is method 3 of Class B");

    }
}

public class methovride {
    public static void main(String args[]) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();


    }

}
