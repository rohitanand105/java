interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
    int a = 34;  // Constants in interfaces are implicitly public, static, and final
}

class Avon implements Bicycle {
    void blowHorn() {
        System.out.println("Voice of horn");
    }
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment) {
        System.out.println("Speed up");
    }
}

public class inter {
    public static void main(String[] args) {
        Avon cycle = new Avon();
        cycle.applyBrake(1);
        cycle.speedUp(5);
        cycle.blowHorn();
        System.out.println("Value of a is " + Bicycle.a); // Accessing the constant through the interface
    }
}
