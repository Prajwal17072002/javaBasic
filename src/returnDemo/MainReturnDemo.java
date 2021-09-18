package returnDemo;

public class MainReturnDemo {

	public static void main(String[] args) {
		
		boolean t=true;
		
		System.out.println("Before return statement");
		
//		caller();
		
		if(t) return; // return to the caller
		
		System.out.println("After return statement");
		
	}
	
	
//	public static void caller() {
//		
//		return;
//	}

}
