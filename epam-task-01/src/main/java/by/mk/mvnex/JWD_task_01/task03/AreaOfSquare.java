package by.mk.mvnex.JWD_task_01.task03;

public class AreaOfSquare {
	public double getAreaSquare(double areaS1 ) {
		double areaS2 = 0;
		try {
			haveInvalidData(areaS1 );
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return areaS2;
		}
		areaS2 = calculateArea(areaS1);
		return areaS2;
	}

	private void haveInvalidData(double area ) throws Exception {
		boolean isInvalidArea = area <=0;
		if(isInvalidArea ) {
			throw new Exception("Incorrect area value. Area less or equal to 0" );
		}
	}
	private double calculateArea(double areaS1) {
		double area = areaS1 / 8;//S1 = 4*R^2; S2 = R^2/2; => S2 = 8S1;
		return area;
	}
}
