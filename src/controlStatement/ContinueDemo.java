package controlStatement;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
			if(i%2==0) continue;        //if this conditions matches, then continue the for loop, do not execute the line below it. 
			System.out.println("");
		}

	}

}
