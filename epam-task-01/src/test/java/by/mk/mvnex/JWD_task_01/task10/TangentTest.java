package by.mk.mvnex.JWD_task_01.task10;

import org.junit.Assert;
import org.junit.Test;	
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class )
public class TangentTest  {
	private double[][] expectedsTable;
	private boolean expected;
	private double a;
	private double b;
	private double h;
	@Parameters
	public static Collection<Object[]> powValues(){
		double [][] mass1 = new double[][] {
				{-5, 3.380515006246586},
				{-3,0.1425465430742778},
				{-1,-1.5574077246549023},
				{1,1.5574077246549023},
				{3,-0.1425465430742778},
				{5,-3.380515006246586}
		};
		double [][] mass2 = new double[][] {
			{5, -3.380515006246586},
			{0,0.0},
			{-5, 3.380515006246586}
	};
		return Arrays.asList(new Object[][]{
			{5, -5, 2 , mass1, false },
			{-5, 5 , -5, mass2 , true},
			{-5, 5 , 0, mass1 , false},
			{-5, 5 , 2, mass1 , true}
		});
	}
	public TangentTest(double a,double b, double h , double[][] expectedsTable, boolean expected) {
		this.a = a;
		this.b = b;
		this.h = h;
		this.expectedsTable = expectedsTable;
		this.expected = expected;
	}
	@Test
	public void ParametrsOfCircleAreaTest01(){
		double[][] actualsTable;
		Tangent obj = new Tangent();
		actualsTable = obj.getTangentTable(a,b,h);
		boolean check = false;
		if(actualsTable != null ) {
		for(int i=0;i<actualsTable.length;i++) {
			check = Arrays.equals(expectedsTable[i], actualsTable[i]);
			if(!check) break;
		}
		}
		boolean actual = check;
		
		Assert.assertEquals(expected, actual);
	}
}


