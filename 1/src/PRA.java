
public class PRA {

	public double px,py;
	public PRA(double x,double y) {
		px = x;
		py = y;
	}
	public static double distance(PRA a,PRA b) {
		double xdiff,ydiff;
		xdiff = a.px - b.px;
		ydiff = a.py - b.py;
		return Math.sqrt(xdiff*xdiff + ydiff*ydiff);	
	}
	public static double random(double low,double high) {
		double r = Math.random();
		return (low + r*(high - low));
	}
	public void show() {
		System.out.println("x = "+this.px);
		System.out.println("y = "+this.py);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PRA a1 = new PRA(random (0.0,2.0),random(-1.0,0.0));
		a1.show();
		PRA a2 = new PRA(random (1.0,1.0),random(-2.0,1.0));
		a2.show();
		PRA a3 = new PRA(random (0.0,1.0),random(-9.0,-8.0));
		a3.show();
		System.out.println(PRA.distance(a1,a2));
//		System.out.println(a1.distance(a2));
	}

}
