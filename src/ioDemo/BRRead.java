package ioDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

    public static void main(String args[]) throws IOException
    //throws IOException
    {
        char c ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // read characters
        do {
           // try {
            int c1 = br.read();
            System.out.println(""+c1);

            c = (char) br.read();
           // } catch (IOException e) {
           //     e.printStackTrace();
           // }

            System.out.println(c);
        }while(c != 'q');

    }
}
