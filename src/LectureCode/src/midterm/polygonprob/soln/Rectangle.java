package midterm.polygonprob.soln;

public class Rectangle extends Polygon {
	double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double[] getLengths() {
		return new double[]{length, length, width, width};
	}	
}
