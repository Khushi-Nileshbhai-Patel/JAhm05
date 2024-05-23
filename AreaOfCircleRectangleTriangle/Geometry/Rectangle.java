package AreaOfCircleRectangleTriangle.Geometry;

public class Rectangle {
	 	private int width;
	    private int height;
	    private int area;
	    public Rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

		public double getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		public int getArea() {
			area = width* height;
			return area;
		}

		@Override
		public String toString() {
			return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
		}
		

		
}
