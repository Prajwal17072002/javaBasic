package imp_Questions;

import java.util.Scanner;

public class Question_4 {



    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int [] weights =new int[n];

        for(int i=0;i<n;i++){
            weights[i]= sc.nextInt();
        }

        int threshold = sc.nextInt();

        int amount = 0;

        for(int i=0;i<n;i++){

            amount += 1;
            if (weights[i]>threshold){
                amount +=1;
            }
        }

        System.out.println(amount);
    }
}
