package simpleCalculator;


import java.util.Scanner;

public class calculator_Demo implements operations1 {



    public static void main(String args[] ){

        Scanner sc = new Scanner(System.in);
        double a,b,c = 0;
        int operation1;

        System.out.println("enter A: ");
        a = getInput(sc);
        System.out.println("enter B: ");
        b = getInput(sc);
        System.out.println("1) A + B\t2) A - B\n3)A * B\t4)A / B");
        operation1 = (int) getInput(sc);

        sc.close();

        switch (operation1){

            case 1:
                c = operations.plus(a,b);
                break;
            case 2:
                c = operations.minus(a,b);
                break;
            case 3:
                c = operations1.multiply(a,b);
                break;
            case 4:
                c = operations1.divide(a,b);
                break;

        }

        System.out.println("Result: "+ c);








    }

    private static double getInput(Scanner sc) {
        return sc.nextDouble();
    }
}
