package propertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		
		String filePath=System.getProperty("user.dir")+"\\data\\example.properties";
		
		FileInputStream file = new FileInputStream(filePath);
		
		properties.load(file);
		
		file.close();
		
		//Read data from properties file
		
		String age=properties.getProperty("age");
		String name=properties.getProperty("name");
		String email=properties.getProperty("email");
		
		System.out.println(age +"   "+name+"    "+email);
		
		//capture all the properties
		Set<String> keys = properties.stringPropertyNames(); //method 1
		System.out.println(keys);
		
		//capture all the properties - method 2
		Set<Object> allkeys = properties.keySet();
		System.out.println(allkeys);
		
		//capture all the values
		Collection<Object> values=properties.values();
		System.out.println(values);
		
		//read all the properties alongwith values
		for(String key:properties.stringPropertyNames())
		{
			System.out.println(key+"   "+properties.getProperty(key));
		}
		
	}

}
