package jsonFiles;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingDataFromJSONUsingJacksonLibrary {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectmapper=new ObjectMapper();
		
		File file=new File(".\\data\\employee.json");

		//Read JSON data from the file nd map to Person class
		Person person=objectmapper.readValue(file,Person.class);
		
		//Access data
		System.out.println("Firstname:"+person.getFirstName());
		System.out.println("Lastname:"+person.getLastName());
		
		System.out.println("Addresses.....");
		for(Address address:person.getAddress())
		{
			System.out.println("Street:"+address.getStreet());
			System.out.println("city:"+address.getCity());
			System.out.println("State:"+address.getState());
		}
		
		
	}

}
