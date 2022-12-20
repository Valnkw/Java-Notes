
public class Cylinder extends Circle {
	double height;
	
	public Cylinder(){
		super();
		height=1.0;	
	}
	public Cylinder(double h) {		//creates a cylinder calling super on the cirlce class contructor
		super();
		this.height=h;
	}
	public Cylinder(double h,double r) {
		super(r);
		this.height=h;
	}
	public Cylinder(double h,double r, String c) {
		super(r,c);
		this.height=h;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double h) {
		this.height=h;
	}
	public String toString() {
		
	return	super.toString()+"\nHeight: "+this.height+"\nVolume: "+this.getVolume();
		
	}
	public double getVolume() {		
	return(super.getArea()*this.height);
	}
	
}
