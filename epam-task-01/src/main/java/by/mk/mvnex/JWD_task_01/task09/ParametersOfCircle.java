package by.mk.mvnex.JWD_task_01.task09;
import static java.lang.Math.PI;

public class ParametersOfCircle {
	public double getAreaOfCircle(double r) {
		double area = 0;
		try {
			haveInvalidData(r);
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return area;
		}
		return r*r*PI;
	}
	
	public double getСircumference(double r) {
		double area = 0;
		try {
			haveInvalidData(r);
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return area;
		}
		return 2*PI*r;
	}
	private void haveInvalidData(double r ) throws Exception {
		boolean isInvalidX = r < 0;
		if(isInvalidX) {
			throw new Exception("Incorrect seconds value. radius must be positive " );
		}
	}
	
}
