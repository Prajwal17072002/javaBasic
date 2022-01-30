package enumdemo;

public class TestNull {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = "  ";
        String str3 = null;

        System.out.println("EMPTY: "+ str1.length());
        System.out.println("Space: "+ str2.length());
        try{
            System.out.println("Null: "+ str3.length());
        }catch (Exception e){
            System.out.println("String is null: ");
            System.out.println(e.toString());
        }


    }

}
