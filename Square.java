
public class Square extends GeometricObject implements Colorable{
	//Initiating Side
	private double side;
	
	public Square() {
	}


	public Square(double side) {
		//Declaring Side
		this.side = side;
		// TODO Auto-generated constructor stub
	}


	public void setSide(double side) {
		//setting sides of square corners
		this.side = side;
	}
	public double getSide() {
		//getSide of all corners of square
		return side;
	}

	@Override
	public double getArea() {
		//declaring area of square shape
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		//returning method of square perimeter
		// TODO Auto-generated method stub
		return side * 4;
	}
    @Override
	public String howToColor() {
    	//returning color of all sides
		// TODO Auto-generated method stub
		return "Color all four sides";
	}
	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}

}
