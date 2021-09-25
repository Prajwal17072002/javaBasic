package objectasparams;

public class PassObjectAsParams {

    public static void main(String args[]) {

        Test t1 = new Test(10,11);
        Test t2 = new Test(10,20);
        Test t3 = new Test(10,11);

        //Comparing the objects
//        int a = 10;
//        int b = 10;
//        if(a == b) System.out.println("Yes single DT is Equal");

//        System.out.println(t1.hashCode());
//        System.out.println(t2.hashCode());
//        System.out.println(t3.hashCode());

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t1));





    }

}
