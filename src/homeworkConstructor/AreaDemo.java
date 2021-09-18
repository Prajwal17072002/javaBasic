package homeworkConstructor;

public class AreaDemo {

	public static void main(String[] args) {
		
		Area p1 = new Area();
		double a1 = p1.area();
		System.out.println(a1);
		
		
		Area p2 = new Area( 12,3.14);
		double a2 = p2.area();
		System.out.println(a2);
		
		

	}

}
