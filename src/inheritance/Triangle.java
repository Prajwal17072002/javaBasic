package inheritance;


//public class Triangle extends Figure {
public class Triangle extends Figure_Abstract {
    //ctor
    Triangle(double a, double b){
        super(a,b);
    }

    //method overiding from Figure-area method
    public double area(){
        System.out.println("Inside area of Triangle.");
        return dim1 * dim2 / 2;
    }

    public  double volume(){ return 10;};
    public  double perimeter(){ return 10;};
    public  double circumference(){ return 10; };

}
