package dataTypes;

public class HomeworkDataTypes {

	public static void main(String[] args) {
		
		byte byteArr[] = {7,8,9,10}; 
		System.out.println(byteArr[2]);
		System.out.println(byteArr.length);
		for(byte i=0; i<byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}
		System.out.println("------------------------------");
		byte byteArr1[] = new byte[10];   
		byteArr1[0] = 18;
		System.out.println(byteArr1[1]);
		for(byte i=0; i<10; i++) {
			System.out.println(byteArr1[i]);
		}
		
		System.out.println("*****************************");
		
		short shortArr3[] = {15,16,66,77,88}; 
		System.out.println(shortArr3[3]);
		System.out.println(shortArr3.length);
		for(short i=0; i<shortArr3.length; i++) {
			System.out.println(shortArr3[i]);
		}
		System.out.println("------------------------------");
		short shortArr4[] = new short[20];   
		shortArr4[0] = 18;
		System.out.println(shortArr4[0]);
		for(short i=0; i<shortArr4.length; i++) {
			System.out.println(shortArr4[i]);
		}
		
		System.out.println("*****************************");
		
		long longarr5[] = {1000,2000,3333,4444,5555}; 
		System.out.println(longarr5[3]);
		System.out.println(longarr5.length);
		for(int i=0; i<longarr5.length; i++) {
			System.out.println(longarr5[i]);
		}
		System.out.println("------------------------------");
		long longarr6[] = new long[15];   
		longarr6[0] = 12;
		System.out.println(longarr6[0]);
		for(int i=0; i<longarr6.length; i++) {
			System.out.println(longarr6[i]);
		}
		
		System.out.println("*****************************");
		
		float floatarr7[] = {1.2f,2.4f,3.5f,4.7f,5.8f}; 
		System.out.println(floatarr7[3]);
		System.out.println(floatarr7.length);
		for(int i=0; i<floatarr7.length; i++) {
			System.out.println(floatarr7[i]);
		}
		System.out.println("------------------------------");
		float floatarr8[] = new float[16];   
		floatarr8[0] = 12.5f;
		System.out.println(floatarr8[0]);
		for(int i=0; i<floatarr8.length; i++) {
			System.out.println(floatarr8[i]);
		}
		
		System.out.println("*****************************");
		
		double doublearr9[] = {4.5,5.6,6.7,7.8,8.9,}; 
		System.out.println(doublearr9[3]);
		System.out.println(doublearr9.length);
		for(int i=0; i<doublearr9.length; i++) {
			System.out.println(doublearr9[i]);
		}
		System.out.println("------------------------------");
		double doublearr10[] = new double[16];   
		doublearr10[0] = 166.66;
		System.out.println(doublearr10[0]);
		for(int i=0; i<doublearr10.length; i++) {
			System.out.println(doublearr10[i]);
		}
		
		System.out.println("********************************");
		
		char chararr11[]= {'p','r','a','j','w','a','l'};
		System.out.print("my name is=");
		for(char i=0;i<chararr11.length;i++) {
			System.out.print(chararr11[i]);
			
		}
		
		System.out.println("\n----------------------------------");
		char chararr12[]=new char[7];
		System.out.print("my name is=");
		chararr12[0] = 'p';
		chararr12[1] = 'r';
		chararr12[2] = 'a';
		chararr12[3] = 'j';
		chararr12[4] = 'w';
		chararr12[5] = 'a';
		chararr12[6] = 'l';
		for(char i=0;i<chararr12.length;i++) {
			System.out.print(chararr11[i]);
		}
		
		System.out.println("\n----------------------------------");
		boolean boolArr[] = {true, false, true, false};
		System.out.print(boolArr[0]);
		System.out.print(boolArr[1]);
		System.out.print(boolArr.length);
		
		
		
	}
}

