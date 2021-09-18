package divi;

public class Divitwonum {

	public static void main(String[] args) {
		
		Divitwonum obj1 = new Divitwonum();
		 
		 float d = obj1.sum(57f,6f);
		 System.out.println(d);

	}
	
	public float sum(float a,float b)
	{
		float f = a/b;
		System.out.println("answer is ");
		return f;
	}

	
}
