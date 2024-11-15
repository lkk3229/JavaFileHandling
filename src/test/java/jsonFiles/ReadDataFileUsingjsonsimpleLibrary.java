package jsonFiles;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFileUsingjsonsimpleLibrary {

	public static void main(String[] args) throws IOException, ParseException  {
		
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader(".\\data\\employee.json");

		//Object obj=jsonparser.parse(reader); //convert json file --> java object
		//JSONObject empjsonobj=(JSONObject)obj;  //java --> jSON Object
		
		JSONObject empjsonobj=(JSONObject)jsonparser.parse(reader); //Converting JSON file --> json object
	
		String fname=(String)empjsonobj.get("firstName");
		String lname=(String)empjsonobj.get("lastName");
		System.out.println("First Name:"+fname);
		System.out.println("Last Name:"+lname);
		
		JSONArray addressArray=(JSONArray) empjsonobj.get("address");
		
		for(int i=0;i<addressArray.size();i++) 
			{
				JSONObject address=(JSONObject)addressArray.get(i);
				String street=(String) address.get("street");
				String city=(String) address.get("city");
				String state=(String) address.get("state");
				
				System.out.println(street+"\t"+city+"\t"+state);
			}
			}
		
			
		
	}


