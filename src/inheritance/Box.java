package inheritance;

public class Box {

    double l, w,h;

    //Default ctor
    Box(){
        l= w = h = -1;
    }

    //Parameterized ctor with 3 parameters
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }


    Box(double l){
        this.l= this.w = this.h = l;
    }


    Box(Box  b){
        this.l= b.l;
        this.w = b.w;
        this.h = b.h;
    }


    public double volume(){
        return l*w*h;
    }
}

