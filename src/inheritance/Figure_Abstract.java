package inheritance;

public abstract class Figure_Abstract {
    double dim1;
    double dim2;

    Figure_Abstract(){
        dim1=dim2=-1;
    }

    Figure_Abstract(double l){
        dim1=dim2=l;
    }

    Figure_Abstract(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    public abstract double area();
    public abstract double volume();
    public abstract double perimeter();
    public abstract double circumference();

    public void test(){
        System.out.println("Some test methods...");

    }
}
