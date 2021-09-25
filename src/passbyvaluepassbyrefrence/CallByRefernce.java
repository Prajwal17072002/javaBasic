package passbyvaluepassbyrefrence;

public class CallByRefernce {

    public static void main(String args[]) {
        int a = 15;
        int b = 20;

        Test tobj = new Test(a , b);


        System.out.println("Before calling object meth() :"+ tobj.a +" , "+ tobj.b);
        tobj.meth(tobj);
        System.out.println("After calling object meth() :"+ tobj.a +" , "+ tobj.b);

    }

}
