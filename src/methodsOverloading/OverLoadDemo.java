package methodsOverloading;

public class OverLoadDemo {

    public static void main(String args[]){

        OverLoad obj1 = new OverLoad();   //default ctor
        obj1.testFun();
        System.out.println("  int return -- " + obj1.testFun(10));
        System.out.println("  str return -- " +obj1.testFun("Prajwal"));
        System.out.println("  sum of 2 int return -- " +obj1.testFun(10,100));


        OverLoad obj2 = new OverLoad("This is ctor Overloading Parametrized");   //parametrized ctor
        obj2.testFun();
        System.out.println("  int return -- "+obj2.testFun(20));
        System.out.println("  str return -- "+obj2.testFun("Prajwal Pune"));
        System.out.println("  sum of 2 int return -- " +obj2.testFun(20,100));

    }
}
