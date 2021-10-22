package inheritance;

public class DynamicMethodDispacthDemo {

    public static void main(String args[]) {

        A a = new A();
        B b = new B();
        C c = new C();

        A aref;

        aref = b;
        aref.print();

        aref = c;
        aref.print();

        aref = a;
        aref.print();

        Object objRef;




    }
}
