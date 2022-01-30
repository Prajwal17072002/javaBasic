package exceptionhandle;

public class TryCatchThrowFinally {

     static void  demoproc(){
        try{
            //code need monitorring
            //a/b
            throw new NullPointerException("demotest");
            //System.out.println("inside demoproc");

        }catch (NullPointerException e){
            System.out.println("Caught inside demoproc");
            throw e; //rethrow the exception
        }finally {
            System.out.println("Finally executed in the demoProc :");
        }
    }


    public static void main (String args[]) {

        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught :"+ e);
        }finally {
            System.out.println("Finally executed at the end :");
        }
    }
}
