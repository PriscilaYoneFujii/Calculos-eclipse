package beans;

public class TianguloRetangulo extends Contas{
	private long a;
	private long b;
	public TianguloRetangulo() {	}
	public TianguloRetangulo(long n, long m) {
		this.a = n;
		this.b = m;
	}
	public double areaTR() {
		return multi(a, b);
	}
	public double volumeTR(double alt) {
		double v = alt * multi(a, b);
		return v;
	}
	public void setA(long a) {
		this.a = a;
	}
	public void setB(long b) {
		this.b = b;
	}
	public void info() {
		System.out.println("status: \n A = "+a+"\n B = "+b);
	}
	public void infoAll(boolean area, boolean volume, boolean vars) {
		if(area == true && volume == true && vars == true) {
			System.out.println("Area: "+areaTR()+"\nVolume: "+volumeTR(5)+"\nAs variaveis:\nA: "+a+"\nB: "+b);
		}
	}
	
}
