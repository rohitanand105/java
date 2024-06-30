package extra;
class Box {
    double width;
    double height;
    double depth;

    Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len){
        width = height = depth = len;        
    }

    double volume(){
        return width * height * depth;
    }
}

public class Overcnst {
    public static void main(String args[]) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);

    }
}
