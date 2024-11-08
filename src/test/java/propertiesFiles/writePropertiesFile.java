package propertiesFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		
		properties.setProperty("name", "Pavan");
		properties.setProperty("email", "Pavan@gmail.com");
		properties.setProperty("age", "30");
		
		String filePath=System.getProperty("user.dir")+"\\data\\example.properties";
		
		FileOutputStream file= new FileOutputStream(filePath);
		
		properties.store(file,"Sample data in proprties file....");
		
		file.close();
		
		System.out.println("Properies have been written into "+filePath);
		
	}

}
