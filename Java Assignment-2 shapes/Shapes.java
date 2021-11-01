package shapes;

public class Shapes {

	public static void main(String[] args) {
		
		shape line=new line();
		shape rectangle = new Rectangle();
		shape cube = new cube();
		
		line.draw();
		rectangle.draw();
		cube.draw();

	}

}

abstract class shape{
	abstract void draw();
}
class line extends shape{
	@Override
	void draw() {
		System.out.println("Line");
	}
}
class Rectangle extends shape{
	@Override
	void draw() {
		System.out.println("RECTANGLE");
	}
}
class cube extends shape{
	@Override
	void draw() {
		System.out.println("CUBE");
	}
}






