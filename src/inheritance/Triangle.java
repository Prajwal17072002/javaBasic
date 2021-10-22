package inheritance;

public class Triangle extends  Figure{

    Triangle(double a, double b){
        super(a,b);
    }

    public double area(){
        System.out.println("Inside area of Triangle.");
        return dim1 * dim2 / 2;
    }
}
