package inheritance;

public class Figure_Abstract_Demo {

    public static void main(String[] args){

        //Figure_Abstract f = new Figure_Abstract(10,10);
        //System.out.println("Area is:" + f.area());

        Rectangle r = new Rectangle(9,9);
        System.out.println("Area is:" + r.area());

        Triangle t = new Triangle(10, 5);
        System.out.println("Area is:" + t.area());

        Figure_Abstract ref ;
        ref = r;
        System.out.println("Area is:" + ref.area());

        ref = t;
        System.out.println("Area is:" + ref.area());

    }


}
