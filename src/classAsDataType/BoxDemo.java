package classAsDataType;


public class BoxDemo  {

	public static void main(String[] args) {
		
		double vol;
			
		Box b1 = new Box();	
		double v1 = b1.voulme();	
		System.out.println(b1.voulme());
		
		Box b2 = new Box();
		b2.l = 100;
		b2.w= 20;
		b2.h = 40;
		
		double v2 = b2.voulme();
		System.out.println(v2);
		
		
		Box b3 = new Box(100, 20,40);
		double v3 = b3.voulme();
		System.out.println(v3);
		
		
	}

}
