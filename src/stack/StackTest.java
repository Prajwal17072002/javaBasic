package stack;

public class StackTest {

    public static void main(String args[]){

        Stack obj = new Stack();
//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        obj.push(40);
//        obj.push(50);


        for(int i=0; i< 5; i++){
            obj.push(i);
        }

        for(int i=0; i< 5; i++){
            System.out.println("  "+obj.pop());
        }


//        System.out.println("  "+obj.pop());
//        System.out.println("  "+obj.pop());
//        System.out.println("  "+obj.pop());
//        System.out.println("  "+obj.pop());
    }
}
