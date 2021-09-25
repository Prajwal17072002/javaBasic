package staticsVarNmethods;

public class Test {

    static  int a = 10;
    int b = 100;

    public static void display(){
        // print(); //only static mehthod is access in static method
        demo();
        // System.out.println(this.a);   //this is not refered in static methods
        System.out.println(a);
        //System.out.println(b);   //static data only is accessed in static method
    }

    public void print(){

    }

    public static void demo(){

    }

}
