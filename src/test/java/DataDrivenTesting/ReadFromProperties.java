package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
public static void main(String[] args) throws IOException {
	//step 1 : convert physical file into java readable object
	FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
	//step 2: create properties class instance
	Properties property = new Properties();
	//step 3 : load all key-value pairs to properties instance from fis
	property.load(fis);//io exception
	//step 4 : fetch data
	String browser = property.getProperty("browser");
	System.out.println(browser);
	
	
	
}
}
