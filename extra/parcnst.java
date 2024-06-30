package extra;
class Box{
    int width;
    int height;
    int depth;

    Box(int w, int h, int d){
        System.out.println("Constructing Box");
        width = w;
        height = h;
        depth = d;


    }

    int volume(){
        return width * height* depth;

    }

}

public class parcnst {
    public static void main(String args[]){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(5, 8, 9);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
        // System.out.println("Hello World");

    }
    
}
