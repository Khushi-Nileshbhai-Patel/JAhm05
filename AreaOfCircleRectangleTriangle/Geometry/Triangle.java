package Geometry;

public class Triangle {
	private int side1;
    private int side2;
    private int side3;
    private int area;
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

	public double getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public double getarea() {
		area = (side1 + side2 + side3)/2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", area=" + area + "]";
	}
	

    
}
