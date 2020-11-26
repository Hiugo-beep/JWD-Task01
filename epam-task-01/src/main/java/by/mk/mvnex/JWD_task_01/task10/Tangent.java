package by.mk.mvnex.JWD_task_01.task10;
import static java.lang.Math.abs;
import static java.lang.Math.tan;
import static java.lang.Math.PI;


public class Tangent {
	public double[][] getTangentTable(double a, double b, double h) {
		try {
			haveInvalidData(a,b,h);
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return null;
		}
		int numberParameters = calculateNumberOfParameters(a,b,h);
		double[][] tangetResults = new double[numberParameters][2];
		double x;
		if(isNegativeH(h)) {
			x = b;
		} else {
			x = a;
		}
		for(int i=0;i<numberParameters;i++) {
			tangetResults[i][0] = x;
			tangetResults[i][1] = getTangent(x);
			x+=h;
		}
		for(int i=0;i<numberParameters;i++) {
		}
		return tangetResults;
	}

	private void haveInvalidData(double a, double b, double h) throws Exception {
		boolean isInvalidCut = a > b;
		if(isInvalidCut) {
			throw new Exception("Incorrect cut parametrs value. a must be <= b " );
		}
		boolean isInvalidH = h == 0;
		if(isInvalidH) {
			throw new Exception("Incorrect H parametrs value. h!= 0 " );
		}
	}
	
	private int calculateNumberOfParameters(double a, double b, double h) {
		int numberOfParametres;
		
			numberOfParametres = (int)((abs(a-b) -1)/abs(h)) + 1;
		boolean lastParameterIsIncluded = (abs(a) + abs(b))%abs(h) ==0;
		if(lastParameterIsIncluded) numberOfParametres++;
		return numberOfParametres;
	}
	private double getTangent(double x) {
		try {
			haveInvalidX(x);
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return 0;
		}
		return tan(x);
	}
	private void haveInvalidX(double x) throws Exception {
		boolean isInvalid = ( (x % (PI/2)) == 0.0 && x != 0);
		if(isInvalid) {
			throw new Exception("Incorrect X parametrs value. x % PI/2 != 0 " );
		}
	}
	
	private boolean isNegativeH(double h) {
		return h<0;
	}
}
