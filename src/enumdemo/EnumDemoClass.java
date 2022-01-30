package enumdemo;

import java.util.Scanner;

public class EnumDemoClass {

    enum Apple{ JAMMU, KASHMIR, HIMACHAL}

    public static void main (String args[]) {

        Apple a1 = Apple.HIMACHAL;

        a1 = Apple.JAMMU;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 'JAMMU, KASHMIR, HIMACHAL'");

        String str = sc.next();
        if(str.equalsIgnoreCase("JAMMU")){
            a1 = Apple.JAMMU;
        }else if(str.equalsIgnoreCase("HIMACHAL")){
            a1 = Apple.HIMACHAL;
        }else if(str.equalsIgnoreCase("KASMIR")){
            a1 = Apple.KASHMIR;
        }else{
            System.out.println("Not valid input try again.");
        }

        switch (a1){
            case JAMMU:
                System.out.println("Apple from "+ a1);
                break;
            case HIMACHAL:
                System.out.println("Apple from "+ a1);
                break;
            case KASHMIR:
                System.out.println("Apple from "+ a1);
                break;
            default:
                System.out.println("Apple from default");

        }

    }
}
