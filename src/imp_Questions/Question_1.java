package imp_Questions;
//palindrome number
import java.util.Scanner;

public class Question_1 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        do{
            n=n+reverse(n);
        }while(n!=reverse(n));
        System.out.println(n);
    }
    public static int reverse(int n){
        int rev=0;
        while (n>0){
            int d=n%10;
            n=n/10;
            rev=rev*10+d;
        }
        return rev;
    }
}
