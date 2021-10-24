package interface_test;

import java.util.ArrayList;

public class TestInterfaceA_Demo {

    public static void main(String args[]){
        TestInterfaceA objA = new  TestInterfaceA();
        objA.test1();
        objA.test2();
        objA.print();

        TestInterface1 obj1 = new  TestInterface1();
        obj1.test1();
        obj1.test2();
        obj1.data();

        InterfaceA refInterface;

        refInterface = objA;
        refInterface.test1();
        refInterface.test2();

        refInterface = obj1;
        refInterface.test1();
        refInterface.test2();
    }
}
