
public class iterate {
	
	private double a;
	private double b;
	
	public iterate(double a, double b) {
		this.a = new Double(a);
		this.b = new Double(b);
	}
	
	public void sum() {
		double res = this.a + this.b;
		System.out.printf("The Sum of %f & %f is %f", this.a, this.b, res);
		System.out.println();
		System.out.println();
	}
	
	public void subtract() {
		double res = this.a - this.b;
		System.out.printf("The Subtraction of %f & %f is %f", this.a, this.b, res);
		System.out.println();
		System.out.println();
	}
	
	public void multiply() {
		double res = this.a*this.b;
		System.out.printf("The Multiplication of %f & %f is %f", this.a, this.b, res);
		System.out.println();
		System.out.println();
	}
	
	public void divide() {
		double res = this.a / this.b;
		System.out.printf("The Division of %f & %f is %f", this.a, this.b, res);
		System.out.println();
		System.out.println();
	}
	
}
