package inheritance;

public class BoxWeight extends  Box{
    double weight ;

    BoxWeight(double l, double w, double h, double weight){
//        this.l = l;
//        this.w = w;
//        this.h = h;
        super(l,w,h);

        this.weight = weight;

    }
}
