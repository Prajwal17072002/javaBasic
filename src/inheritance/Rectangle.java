package inheritance;

//public class Rectangle extends Figure {
public  class Rectangle extends Figure_Abstract {


    Rectangle(double a, double b){
        super(a,b);
    }

    public double area(){
        System.out.println("Inside area of Rectangle.");
        return dim1*dim2;
    }
    public  double volume(){ return 1;};
    public  double perimeter(){ return 1;};
    public  double circumference(){ return 1; };

}
