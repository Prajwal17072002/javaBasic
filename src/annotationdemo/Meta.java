package annotationdemo;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnno{
    String str();
    int val();
}


public class Meta {


    @MyAnno(str = "My name is Prajwal", val=2000)
    public static void myMethod(){

        Meta obj = new Meta();

        try {
            Class c = obj.getClass(); //name of the class of that reference i.e Meta
            Method m = c.getMethod("myMethod");
            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + "  "+ anno.val() );

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
            e.printStackTrace();

        }

    }

//    public void test(){
//
//    }


    public static void main(String args[]){
        myMethod();
    }
}
