package by.mk.mvnex.JWD_task_01.task06;

public class TimeBySeconds {
	public String getTime(int secondsN) {
		String time = "";
		try {
			haveInvalidData(secondsN );
		} catch(Exception e ) {
			System.out.println(e.getMessage() );
			return time;
		}
		Integer minutes = getMinutes(secondsN);
		Integer hours = getHours(secondsN);
		Integer seconds = getSeconds(secondsN);
		time = hours + ":" + minutes + ":" + seconds;
		return time;
	}
	
	private void haveInvalidData(int seconds ) throws Exception {
		boolean isInvalidSeconds = seconds < 0 || seconds > 86400;
		if(isInvalidSeconds) {
			throw new Exception("Incorrect seconds value. seconds less than 0 or more then 86400 " );
		}
	}
	
	private int getHours(int seconds) {
		return seconds/3600 ;
	}
	private int getMinutes(int seconds) {
		return seconds%3600/60 ;
	}
	private int getSeconds(int seconds) {
		return seconds%60 ;
	}
	
}
