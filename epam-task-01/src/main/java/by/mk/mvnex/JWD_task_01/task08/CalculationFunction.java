package by.mk.mvnex.JWD_task_01.task08;


public class CalculationFunction {
	public double calculationFunction(double x) {
		double answer = 0;
		try {
			haveInvalidData(x);
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return answer;
		}
		boolean isFirstCondition = x>=3;
		answer = isFirstCondition ? funOf1stCondition(x) : funOf2ndCondition(x);
		return answer ;
	}
	
	private void haveInvalidData(double x ) throws Exception {
		boolean isInvalidX = (int)(x*x*x + 0.1) == 6;
		if(isInvalidX) {
			throw new Exception("Incorrect seconds value. to avoid division by zero it is necessary that "
					+ "x^3 != 6 " );
		}
	}
	
	
	private double funOf1stCondition(double x) {
		return -(x*x) + 3*x +9;
	}
	private double funOf2ndCondition(double x) {
		return 1/(x*x*x -6);
	}
}
