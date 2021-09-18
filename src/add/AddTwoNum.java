package add;

public class AddTwoNum {

	public static void main(String[] args) {

		AddTwoNum obj1 = new AddTwoNum();
		
		int x =obj1.sum(10,10);
		System.out.println(x);

	}
	
	
	public int sum(int a, int b) {
		return a+b;
	}

}

