package dataTypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		byte b1=1, b2 =10;
		System.out.println(b1);
		System.out.println(b2);
		
		char c = 'o';
		System.out.println(c);
		
		char ch = 98;   // code for 'b' ascii
		System.out.println(ch);

		char ch1 = 65;   // code for 'A' ascii
		System.out.println(ch1);

		System.out.println("*************************");

		for(char ch2=65; ch2<91; ch2++)
			System.out.print(" "+ch2);

		System.out.println("*************************");
		System.out.println(12f);
	
		System.out.println("*******************");
		System.out.println('2'+'/'+ '3');   //148
		System.out.println('\141');    //a  - octal
		System.out.println('\u0061');    //a  - hexadecimal
		
		String str =  "\""; // "ab\tcd";
		System.out.println(str);
		System.out.println("*******************");
		int intArr[] = {10,34,12,234,345345}; // declare and initilization
		System.out.println(intArr[2]);
		System.out.println(intArr.length);
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		int intArr1[] = new int[12];   //declare
		intArr1[0] = 100;
		System.out.println(intArr1[1]);
		for(int i=0; i<intArr1.length; i++) {
			System.out.println(intArr1[i]);
		}
		
		
		
		
	}

}
