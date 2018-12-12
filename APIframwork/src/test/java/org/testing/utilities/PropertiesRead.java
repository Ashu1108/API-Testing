package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	
	public String ReadProperty(String key) throws IOException

	{
		File f = new File("C:\\Users\\Admin\\git\\API-Testing\\APIframwork\\Eve.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		
		return pr.getProperty(key);
		
	}
}
