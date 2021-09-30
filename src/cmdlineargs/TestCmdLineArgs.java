package cmdlineargs;

public class TestCmdLineArgs {

    public static void vaTest(int ... v){
        for(int x : v)
            System.out.print(x);
    }

    public static void vaTest(String str, int ... v){
        System.out.print(str);

        for(int x : v)
            System.out.print(x);
    }



    public static void main(String args[]) {

        //Command Line argumenst -- Run -> Edit config -> + -> program -> class name with package -> then pass argumnets
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        //Variable length arguments
        vaTest();
        vaTest(12);
        vaTest(10,12,13);
        vaTest(1,2,6,5,8,9);

        vaTest("Prajawal");
        vaTest("Prajawal",12);
        vaTest("Prajawal",12,15,15,16);
    }
}
