package inheritance;

public class B extends A {
    int k=100;

    public void showik(){
        System.out.println("value of i ="+ i + " and k = "+ k);
    }

    public void show(){
        //super.show();
        System.out.println("value of k = "+ k);
    }

    public void print(){
        System.out.println("Inside B class!!");
    }

}
