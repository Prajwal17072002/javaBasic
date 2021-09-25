package passbyvaluepassbyrefrence;

public class CallByValue {

    public static void main(String args[]) {
        Test obj = new Test();
        int a = 15;
        int b = 20;

        System.out.println("Before calling object meth() :"+ a +" , "+ b);
        obj.meth(a, b);
        System.out.println("After calling object meth() :"+ a +" , "+ b);

    }
}
