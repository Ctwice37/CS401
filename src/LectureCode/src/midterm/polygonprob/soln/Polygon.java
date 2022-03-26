package midterm.polygonprob.soln;

public abstract class Polygon {
	public double computeLength() {
		double sum = 0;
		for(double d : getLengths()) {
			sum += d;
		}
		return sum;
	}
	abstract public double[] getLengths();
}
