package by.mk.mvnex.JWD_task_01.task06;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class TimeBySecondsTest  {
	private int number;
	private String expecteds;
	@Parameters
	public static Collection<Object[]> powValues(){
		return Arrays.asList(new Object[][]{
			{9580, "2:39:40"},
			{86500,""}
		});
	}
	public TimeBySecondsTest(int number , String expecteds) {
		this.number = number;
		this.expecteds = expecteds;
	}
	@Test
	public void TimeBySecondsTest01(){
		String actual;
		TimeBySeconds obj = new TimeBySeconds();
		actual = obj.getTime(number);
		Assert.assertEquals(expecteds, actual);
	}
}

