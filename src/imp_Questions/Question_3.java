package imp_Questions;

import java.util.Scanner;


public class Question_3 {

    public static void main(String[]args){

        String input = new Scanner(System.in).nextLine();
        String output ="";
        for (String c :input.split(""))
            if (!output.contains(c))
                output=c+output;
            System.out.println(output);
    }
}
