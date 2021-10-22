package inheritance;

public class BoxDemo {

    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10,20,30,35.5);
        BoxWeight mybox2 = new BoxWeight(100,200,300,350.5);

        double vol = mybox1.volume();
        System.out.println(vol);
        System.out.println("Weight of box:"+ mybox1.weight);

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println("Weight of box:"+ mybox2.weight);


        Box b1 = new Box();
        System.out.println("Default box volm: "+b1.volume());

        Box b2 = new Box(100);
        System.out.println("Default box volm: "+b2.volume());

        Box b3 = new Box(b1);
        System.out.println("Default box volm: "+b3.volume());



    }
}
