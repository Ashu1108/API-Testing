package org.testing.testcase;

import java.io.IOException;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

public class TC1 {
	
	PropertiesRead pr = new PropertiesRead();
	
	@Test
	public void testCase1() throws IOException
	{
		
		
		HTTPMethods Request = new HTTPMethods(pr);
		Request.GetRequest("DEV_URI"); // call step
		

}
}