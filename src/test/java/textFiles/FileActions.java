package textFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

	//creating a file
	public static void createFile(String filePath) 
	{
		File myObj= new File(filePath);
		
		try {
		    if(myObj.createNewFile())
		{
			System.out.println("File Created:"+myObj.getName());
		}
		else
		{
			System.out.println("File is already exists.");
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
	}	
	
	//writting data into file
	public static void writeFile(String filePath) 
	{
		try
		{
		FileWriter mywritter=new FileWriter(filePath);
		mywritter.write("Welcome to java file handling.......");
		mywritter.close();
		System.out.println("Successfully wrote to the file.....");
		}
		catch(IOException e)
		{
			System.out.println("An error occured..........");
			e.printStackTrace();
		}
	}
	
	//reading data from File
	public static void readFile(String filePath) 
	{
		try
		{
		File myObj=new File(filePath);
		
		Scanner myReader=new Scanner(myObj);
		
		while(myReader.hasNextLine())
		{
			String data=myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("An error occured while reading.....");
			e.printStackTrace();
		}
	}
	
	//renaming a file
	public static void renameFile(String oldFilePath, String newFilePath)
	{
		File oldFile=new File(oldFilePath);
		File newFile=new File(newFilePath);
		
		if(oldFile.renameTo(newFile))
		{
			System.out.println("File is renamed....");
		}
		else
		{
			System.out.println("The file cannot be renamed.....");
		}
		
	}
	
	//delete a file
	public static void deleteFile(String filePath)
	{
		File myObj=new File(filePath);
		
		if(myObj.delete())
		{
			System.out.println("delete the file: "+myObj.getName());
		}
		else
		{
			System.out.println("Failed to delete the file...");
		}
	}
	
	public static void main(String[] args) throws IOException {
		String filePath="C:\\myFile\\myfile.txt";
		createFile(filePath);
		writeFile(filePath);
		readFile(filePath);
		
		String filePathNew="C:\\myFile\\myfile1.txt";
		renameFile(filePath,filePathNew);
		
		deleteFile(filePathNew);
		
	}

}
