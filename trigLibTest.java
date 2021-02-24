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
	
        	@Test
	public void negativeSin() { //neg sin val test
		double x = -5.3;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
	
	
	@Test
	public void SinValZero() { //0 sin val test
		double x = 0;
		double ans = trigLib.trigFunctions.sin(x);
		
		assertEquals(Math.sin(x), ans, 0.025);
	}
	
	@Test
	public void CosQ1() { //First quad cos test
		double x = .5;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
	
	@Test
	public void CosQ2() { //Second quad cos test
		double x = 2;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
	
	@Test
	public void CosQ3() { //Third quad cos test
		double x = 3.5;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
	
	@Test
	public void CosQ4() { //Fourth quad cos test
		double x = 6;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
        @Test
	public void negativeCos() { //neg cos val test
		double x = -4.3;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
	
	@Test
	public void CosValZero() { //0 cos val test
		double x = 0;
		double ans = trigLib.trigFunctions.cos(x);
		
		assertEquals(Math.cos(x), ans, 0.025);
	}
	
	
	@Test
	public void TanQ1() { //First quad tan test
		double x = .5;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
	
	
	@Test
	public void TanQ2() { //Second quad tan test
		double x = 2;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
	
	
	@Test
	public void TanQ3() { //Third quad tan test
		double x = 3.5;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
	
	
	@Test
	public void TanQ4() { //Fourth quad tan test
		double x = 6;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
	
        @Test
	public void negativeTan() { //neg tan val test
		double x = -4.5;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
	
	
	@Test
	public void TanValZero() { //0 tan val test
		double x = 0;
		double ans = trigLib.trigFunctions.tan(x);
		
		assertEquals(Math.tan(x), ans, 0.025);
	}
        
	@Test
	public void SinQ1Deg() { //First quad sin test
		double x = 50;
		double ans= trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void SinQ2Deg() { //Second quad sin test
		double x = 125;
		double ans = trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void SinQ3Deg() { //Third quad sin test
		double x = 220;
		double ans = trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}

	@Test
	public void SinQ4Deg() { //Fourth quad sin test
		double x = 345;
		double ans = trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}
	
        @Test
	public void negativeSinDeg() { //neg sin val test
		double x = -30;
		double ans = trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void SinValZeroDeg() { //0 sin val test
		double x = 0;
		double ans = trigLib.trigFunctions.DegSin(x);
		
		assertEquals(Math.sin(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void CosQ1Deg() { //First quad cos test
		double x = 45;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void CosQ2Deg() { //Second quad cos test
		double x = 120;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}

	@Test
	public void CosQ3Deg() { //Third quad cos test
		double x = 200;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void CosQ4Deg() { //Fourth quad cos test
		double x = 300;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void negativeCosDeg() { //neg cos val test
		double x = -45;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void CosValZeroDeg() { //0 cos val test
		double x = 0;
		double ans = trigLib.trigFunctions.DegCos(x);
		
		assertEquals(Math.cos(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void TanQ1Deg() { //First quad tan test
		double x = 50;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void TanQ2Deg() { //Second quad tan test
		double x = 150;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void TanQ3Deg() { //Third quad tan test
		double x = 250;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void TanQ4Deg() { //Fourth quad tan test
		double x = 325;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
        
        @Test
	public void negativeTanDeg() { //neg tan val test
		double x = -45;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
	
	@Test
	public void TanValZeroDeg() { //0 tan val test
		double x = 0;
		double ans = trigLib.trigFunctions.DegTan(x);
		
		assertEquals(Math.tan(Math.toRadians(x)), ans, 0.025);
	}
}
