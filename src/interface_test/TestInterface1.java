package interface_test;

public class TestInterface1 implements InterfaceA{

    @Override
    public void test1() {
        System.out.println("test1 From TestInterface1 class ");
    }

    @Override
    public void test2() {
        System.out.println("test2 From TestInterface1 class ");

    }

    public void data(){
        System.out.println("data From TestInterface1 class ");
    }

}
