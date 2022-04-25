
public abstract class GeometricObject {
	private String color = "while";
	private boolean  filled;
	private java.util.Date dateCreated;
	//Constructing a default geometric object
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	//Constructing Geometric Object with color and filled value
		protected GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		
			
		}
		//Return color
		public String getColor() {
			return color;
		}
		//Set new color
		public void setColor(String color) {
			this.color = color;
		}
		//Return Filled of a boolean
		public boolean isFilled() {
			return filled;
		}
		//Set new Filled
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		//Get datCreated
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		@Override
		public String toString() {
			return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
			
					
		}
		//Abstract Method declaring getArea
		public abstract double getArea();
		
		//Abstract Method getPerimeter
		public abstract double getPerimeter();
		public String howToColor() {
			// TODO Auto-generated method stub
			return null;
		}
	}


