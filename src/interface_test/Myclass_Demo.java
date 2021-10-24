package interface_test;

public class Myclass_Demo {

    public static void main (String args[]){

        Myclass obj= new Myclass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.dummy();


        A refA = new Myclass();
        refA.method1();
        refA.method2();

        B refB = new Myclass();
        refB.method1();
        refB.method2();
        refB.method3();




    }
}
