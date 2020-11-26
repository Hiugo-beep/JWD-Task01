package by.mk.mvnex.JWD_task_01.task07;
import static java.lang.Math.sqrt;

public class NearestPointToOrigin {
	public int checkAIsNearesPoint(Point A, Point B) {
		double  distanceToOriginA = determineDistanceToOrigin(A.getX(), A.getY());
		double  distanceToOriginB = determineDistanceToOrigin(B.getX(), B.getY());
		boolean aIsCloser = distanceToOriginA < distanceToOriginB;
		boolean bIsCloser = distanceToOriginA > distanceToOriginB;
		if(aIsCloser) return 1;
		else 
			if(bIsCloser) return -1;
			else return 0;
	}
	private double determineDistanceToOrigin(double  x, double  y) {
		double xSquared = x*x;
		double ySquared = y*y;
		double distance = sqrt(xSquared + ySquared);
		return distance;
	}
}
class Point {
	private double  x;
	private double  y;
	public Point(double  x, double  y){
		this.x = x;
		this.y = y;
	}
	public double  getX() {
		return x;
	}
	public double  getY() {
		return y;
	}
}
