package homeworkConstructor;

public class Area {
	
	double pi=3.14;
	double r;
	
	Area(){
		
		this.r = 10;
		this.pi = 3.14;
	}
	
	Area(double r,double pi){
		
		this.r = r;
		this.pi = pi;
	}
	
	public double area() {
		
		System.out.println("area of circle:  ");
		return pi*r*r;
		
		
	}

}
