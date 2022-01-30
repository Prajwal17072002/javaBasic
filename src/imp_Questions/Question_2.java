package imp_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int desc[]=new int[n];
        int index=0;
        for(int i=n-1;i>=0;i--){

            desc[index++]=arr[i];
        }
        for(int i=0;i<n-1;i=i+2){

            int temp=desc[i];
            desc[i]=desc[i+1];
            desc[i+1]=temp;
        }
        for(int i=0;i<n;i++)
            System.out.println(desc[i]+"");
    }
}
