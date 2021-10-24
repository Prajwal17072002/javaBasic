package exceptionhandle;
import java.lang.Error;
import java.util.Scanner;

public class TestExceptionHandle {

    public static void main (String args[]){

        //int a =10;
        //int b =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();


        try{
            System.out.println(" value: "+a/b);
            System.out.println(" After 1: ");
            System.out.println(" After 2: ");
        }catch (Exception ae){
            System.out.println("Found exception: Cannot divide by zero");
           // ae.printStackTrace();
        }

    }
}
