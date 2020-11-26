package by.mk.mvnex.JWD_task_01.task02;

public class NumberOfDaysInMonth  {
	public int getNumberOfDaysInMonth(int year, int monthNumber ){
		int daysNumber = 0;
		try {
			haveInvalidData(year, monthNumber );
		} catch (Exception e ) {
			System.out.println(e.getMessage() );
			return daysNumber;
		}
		boolean isFebruary = monthNumber == 2;
		if(isFebruary ) {
			daysNumber = daysInFebruary(year );
		}
		else {
			boolean is30DaysMonth = have30DaysMonth(monthNumber );
			if(is30DaysMonth ) {
				daysNumber=30;
			}
			else {
				daysNumber = 31;
			}
		}
		return daysNumber;
	}
	
	private void haveInvalidData(int year, int monthNumber ) throws Exception {
		boolean isInvalidYear = year <=0;
		if(isInvalidYear ) {
			throw new Exception("Incorrect year value. Year less than 1" );
		}
		boolean isInvalidMonthNumberLess = monthNumber < 1;
		if(isInvalidMonthNumberLess ) {
			throw new Exception("The month number value is incorrect. Month number less than 1" );
		}
		boolean isInvalidMonthNumberMore = monthNumber > 12;
		if(isInvalidMonthNumberMore ) {
			throw new Exception("The month number value is incorrect. Month number greater than 12" );
		}
	}
	private boolean defineLeapYear(int year ) {
		boolean isLeapYearReason1 = year%400 == 0;
		boolean isLeapYearReason2 = year%4 == 0 && year%100 !=0;
		boolean isLeapYear = isLeapYearReason1 || isLeapYearReason2;
		return isLeapYear;
	}
	
	private int daysInFebruary(int year ) {
		int daysNumber;
		if(defineLeapYear(year ) ) {
			daysNumber = 29;
		}
		else {
			daysNumber = 28;
		}
		return daysNumber;
	}
	
	private boolean have30DaysMonth(int monthNumber ) {
		boolean is30DaysMonth = monthNumber == 4 || monthNumber == 6 ||
				monthNumber == 9 || monthNumber == 11;
		return is30DaysMonth;
	}

}
