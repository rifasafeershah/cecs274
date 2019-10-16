import java.lang.Math;

public class WarmUp2 {

	public static void main(String[] args) {
		int x1 = (int) (Math.random()*10);
		int y1 = (int) (Math.random()*10);
		
		int x2 = (int) Math.random();
		int y2 = (int) Math.random();
		
		int sub2 = x2 - x1;
		int sub1 = y2 - y1;
		double d = Math.sqrt(Math.pow(sub2, 2) + Math.pow(sub1, 2));
		
		System.out.println("First Coordinate: (" + x1 + ", " + y1 + ")");
		System.out.println("Second Coordinate: (" + x2 + ", " + y2 + ")");
		System.out.printf("The distance between the two points is %.4f", d);
	}
}
