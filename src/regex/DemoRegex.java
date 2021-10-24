package regex;
import java.util.regex.*;

public class DemoRegex {


    public static void main(String args[]){

        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String str1 = "798abcd11xyz6mnop7";

        //System.out.println(str.matches('\d'));

        //Pattern p = Pattern.compile("\\d");
        //Pattern p = Pattern.compile("[0-9]");

        //Pattern p = Pattern.compile("\\d+");
        Pattern p = Pattern.compile("\\D+");
        String[] result1 = p.split(str1);
        for(String a: result1){
            System.out.println(a);
        }

//        System.out.println(p.split(str1)[0]);
//        System.out.println(p.split(str1)[1]);
//        System.out.println(p.split(str1)[2]);

        // Custom string
        String text = "geeks1for2geeks3";
        Pattern pattern = Pattern.compile(
                "\\d", Pattern.CASE_INSENSITIVE);

        // Used to perform case insensitive search of the
        // string
        String[] result = pattern.split(text);

        // Iterating using for each loop
        for (String temp : result)
            System.out.println(temp);


        String name = "My name is Prajwal";
        Pattern p1 = Pattern.compile("\\s");
        String[] nameArr = p1.split(name);
        for (String temp : nameArr)
            System.out.println(temp);

        String test = "abcdef12xyz456oplmn789";
        Pattern p2 = Pattern.compile("\\D+");
        String[] testarr = p2.split(test);

        for(String temp : testarr)
            System.out.println(temp);


        String allStr = "adefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Pattern p3 = Pattern.compile("[A-Z]");
        String[] allStrArr = p3.split(allStr);
        for(String temp : allStrArr)
            System.out.println(temp);


        String myname = "PRAJWAL CHORDIYA";
        String rev = "" ;
//        Pattern p4 = Pattern.compile("myname");
//        String[] mynamearr = p4.split(myname);
        int length = myname.length();
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+myname.charAt(i);
        }
        System.out.println("Reversed string is:"+ rev);
    }


}
