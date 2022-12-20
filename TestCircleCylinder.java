
public class TestCircleCylinder {
	public static void main(String[] args) {
		Circle circle1=new Circle(2.0,"blue");
		Cylinder cylinder2=new Cylinder(4.0,3.0,"red");
		System.out.println(circle1);
		
		System.out.println("\n"+cylinder2);
		cylinder2.setColor("green");
		cylinder2.SetRadius(5.0);
		System.out.println("\n"+cylinder2);
	}
}
