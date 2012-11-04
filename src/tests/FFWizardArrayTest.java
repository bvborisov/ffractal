package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.ri2c.flame.gui.*;

public class FFWizardArrayTest {
	
	FFWizardArray ffwa1 = new FFWizardArray();
	FFWizard ffw1 		= new FFWizard();
	
	@Test
	public void testFFWizardArray()
	{
		String[] names =  {"ArrayFunction#1","ArrayFunction#2","ArrayFunction#3"};
		ffw1.incCount();
		ffwa1.setNames(3);
		assertTrue("problem with constructor1",ffwa1.getTitle().equals("New Flame Function Array"));
		assertTrue("problem with constructor2",ffwa1.isVisible()==false);
		assertTrue("problem with constructor3",ffwa1.isResizable()==false);
		assertTrue("problem with setNames, length = " + names.length,ffwa1.getFFNames().length==(names).length);
	}
}
