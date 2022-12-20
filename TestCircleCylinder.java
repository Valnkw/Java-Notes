
public class TestCircleCylinder {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(2.0,"blue");		//creating a blue circle with a radius of 2
		Cylinder cylinder2 = new Cylinder(4.0,3.0,"red");		//creating a red cylinder with a radius of 3 and height of 4

		System.out.println(circle1);
		System.out.println("\n"+ cylinder2);
		cylinder2.setColor("green"); 
		cylinder2.SetRadius(5.0);

		System.out.println("\n"+ cylinder2);
	}
}
