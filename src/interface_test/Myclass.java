package interface_test;

public class Myclass implements B {



    @Override
    public void method1() {
        System.out.println("Method1");

    }

    @Override
    public void method2() {
        System.out.println("Method2");

    }

    @Override
    public void method3() {
        System.out.println("Method3");

    }

    public void dummy(){
        System.out.println("Dummy method in MyClass");
    }
}
