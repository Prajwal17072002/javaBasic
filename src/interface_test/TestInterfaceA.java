package interface_test;

public class TestInterfaceA implements InterfaceA{

    @Override
    public void test1(){
        System.out.println("test1 From TestInterfaceA class ");

    }   // public abstract

    @Override
    public void test2(){
        System.out.println("test2 From TestInterfaceA class ");
    }

    public void print(){
        System.out.println("print From TestInterfaceA class ");
    }
}
