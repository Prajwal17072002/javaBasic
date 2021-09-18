package classAsDataType;

public class Box {

	double w;   //instance variable;
	double l;
	double h;
	
	//default constructor
	public Box(){
		this.l = 10;
		this.w = 10;
		this.h = 10;
	}
	
	
	//parameterized constructor
	public Box(double l,double w, double h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	
	public double voulme() {
		System.out.println("Voulme: ");
		return l*w*h;
	}
}
