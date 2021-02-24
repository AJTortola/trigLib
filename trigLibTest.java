//Description: Test Cases for Trigonometric Library

import static org.junit.Assert.*;
import org.junit.Test;

public class trigLibTest {
	
	public trigLib.trigFunctions test;
	
	public static double Pi = 3.1415926; //Rounded Pi value
	
	@Test
	public void SinQ1() { //First quad sin test
		double x = .5;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
	
	
	@Test
	public void SinQ2() { //Second quad sin test
		double x = 2;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
	
	
	@Test
	public void SinQ3() { //Third quad sin test
		double x = 3.5;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
	
	
	@Test
	public void SinQ4() { //Fourth quad sin test
		double x = 6;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
}
