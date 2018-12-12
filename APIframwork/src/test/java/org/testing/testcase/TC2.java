package org.testing.testcase;

import java.io.IOException;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

public class TC2 {
	
	PropertiesRead pr = new PropertiesRead();
	
	@Test
	
	public void testcase2() throws IOException
	{
		HTTPMethods Request = new HTTPMethods(pr);
		Request.PostRequest("DEV_URI");
		
	}
			
	

}
 