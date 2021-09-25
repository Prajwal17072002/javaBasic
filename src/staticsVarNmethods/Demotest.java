package staticsVarNmethods;

public class Demotest {

        public static void main(String args[]){

         System.out.println(Test.a);

         Test t = new Test();
         System.out.println(t.b);
         t.print();

         Test.demo();
         Test.display();

         final int a =10;
         // a =20;   //can not assign to final varibale


        }

}
