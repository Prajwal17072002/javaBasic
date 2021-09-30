package stringsDemo;

public class DemoStrings {

    public static void main(String args[]){

        String str = "abc";
        char data[] = {'a', 'b', 'c'};
        String str1 = new String(data);

        
        System.out.println( str.equals("xyz") );  //fasle
        System.out.println( str.equals("abc") );  //true
        System.out.println( str.equals("ABC") );  //false

        System.out.println( str.equalsIgnoreCase("ABC") );   //true

        str = "Prajwal";
        System.out.println(str);
        System.out.println(str.toUpperCase());

        System.out.println(str.concat("Chordiya!!!"));
        System.out.println(str);


        str = "    Welcome tp Java Class!!!      ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str);
        str = str.trim();
        System.out.println(str);
        System.out.println(str.valueOf(0));

        System.out.println("*********************************************");

        str="Prajwal Sanjay Chordiya";
        System.out.println(str);
        System.out.println(str.charAt(6));

        System.out.println(str.codePointAt(12));
        System.out.println(str.codePointBefore(12));
        System.out.println(str.codePointCount(7,12));

        str="abcd";
        System.out.println(str.compareTo("acbd"));
        System.out.println(str.compareTo("abcd"));
        System.out.println(str.compareTo("rxyz"));
        System.out.println(str.indexOf(0));

    }

}



//public class TestString extends String {    //can not inherit from 'java.lang.String'
//
//}

