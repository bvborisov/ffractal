package tests;



import static org.junit.Assert.*;

import org.junit.Test;
import org.ri2c.flame.FFunction;

public class FFunctionTest {

	@Test
	public void testFFunction() {
		double[] testArray = {0.4,0.6,0.3,-0.2,-0.8,-0.9};
		double color = 0.3;
		FFunction tester = new FFunction(color, testArray);
		assertTrue("no message",tester.getWeight() == 1);
		assertTrue("no message",tester.getName().equals(""));
		
		
	}

}
