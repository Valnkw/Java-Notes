
public class Circle{
	double radius;
	String color;
	
	public Circle() {		//default constructor for a circle
		radius=1.0;
		color="red";
	}
	
	public Circle(double r) {		//2nd constructor, takes raidus for parameter
	this.radius=r;
	
		
	}
	public Circle(double r, String c) { 		//3rd constructor that takes in radius + color parameters 
		this.radius=r;		//set parameter r equal to radius
		this.color=c;		//set parameter c equal to color
	}
	
	public double GetRadius() {
		return this.radius;
	}
	public void SetRadius(double r) {
		this.radius=r;
	}
	public String GetColor() {		
		return this.color;
	}
	public void setColor(String c) {
		this.color=c;
	}
	
	public double getArea() {
		return (Math.PI*Math.pow(this.radius, 2));
	}
	public String toString() {		//ToString to clean the output
		return "Radius: "+this.radius+"\nColor: "+this.color+"\nArea: "+this.getArea();
		
	}
	

}
