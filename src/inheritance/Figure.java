package inheritance;


public class Figure {
    double dim1;
    double dim2;

    Figure(){
        dim1=dim2=-1;
    }

    Figure(double l){
        dim1=dim2=l;
    }

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    public double area(){
        System.out.println("Figure - method area..");
        return 1.0;
    }
}
