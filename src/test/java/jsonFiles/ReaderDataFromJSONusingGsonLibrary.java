package jsonFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class ReaderDataFromJSONusingGsonLibrary {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader reader = new FileReader(".\\data\\employee.json");
		
		Gson gson=new Gson();
		Person person=gson.fromJson(reader, Person.class);
		
		//access data
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
