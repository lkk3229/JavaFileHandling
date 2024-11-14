package csvFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWritter {
	
	public static void main(String[] args) throws IOException {
		
		String csvFileName=System.getProperty("user.dir")+"\\data\\example.csv";
		
		FileWriter writer = new FileWriter(csvFileName);
		
		writer.append("Name, age,Email \n"); //header
		writer.append("John,30,john@gmail.com \n");
		writer.append("son,40,john1@gmail.com \n");
		writer.append("roy,20,john2@gmail.com \n");
		writer.append("bunny,50,john3@gmail.com \n");
		writer.append("honney,30,john4@gmail.com \n");
		
		writer.close();
		
		System.out.println("CSV file created at:"+csvFileName);
		
		
		
		
		
		
		
		
	}

}
