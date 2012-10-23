package org.ri2c.flame;

import static org.junit.Assert.*;

import org.junit.Test;

public class FFunctionTest {

	@Test
	public void testFFunction() {
		double[] testArray = {0.4,0.6,0.3,-0.2,-0.8,-0.9};
		FFunction tester = new FFunction(0.4, testArray);
		assertTrue("no message",tester.getWeight() == 1);
		
	}

}
