package inheritance;

public class InheritanceDemo {

    public static void main(String args[]){

        A a = new A();
        a.i = 1000;
        //a.j = 20;  //error priavte
        a.showij();

        B b = new B();
        b.i = 100;
        //b.j = 200;  //error
        b.k = 300;
        b.showij();
        b.showik();


    }
}
