package inheritance;

public class FigureAreaDemo {
    public static void main(String[] args){

       // Figure f = new Figure(10,10);

        Rectangle r = new Rectangle(9,9);
        Triangle t = new Triangle(10, 5);

        Figure figRef;

        figRef = r;
        System.out.println("Area is:" + figRef.area());

        figRef = t;
        System.out.println("Area is:" + figRef.area());

        //figRef = f;
        //System.out.println("Area is:" + figRef.area());

    }
}
