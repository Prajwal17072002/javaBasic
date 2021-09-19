package methodsOverloading;

import java.util.Locale;

public class OverLoad {

    public OverLoad(){
        System.out.println("Dfault ctor");
    }

    public OverLoad(String str){
        System.out.println("Paramterized ctor: "+ str);
    }

    public void testFun(){
        System.out.println("testFunc without any agument");
    }

    public int testFun(int a){
        System.out.println("testFunc with one int agument");
        return a;
    }

    public String testFun(String aStr){
        System.out.println("testFunc with one String agument");
        return aStr.toUpperCase();
    }

    public int testFun(int a, int b){
        System.out.println("testFunc with two int agument");
        return a+b;
    }


}
