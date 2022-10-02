package classproJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class jsonReader {

	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();
		
		try {
			FileReader reader=new FileReader("./src/test/resources/employeeList.json");
			Object obj=jsonParser.parse(reader);
			JSONArray employeeList=(JSONArray)obj;
			System.out.println(employeeList.get(1));
			System.out.println(employeeList.size());
			for(Object obj1:employeeList) {
				System.out.println(obj1);
			}
			objectExtractor(employeeList.get(1));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public static void objectExtractor(Object obj) {
		JSONObject employee=(JSONObject)obj;
		System.out.println(employee.get("Department"));
		 System.out.println(employee.get("employee1"));
         Object details = employee.get("employee2");
         JSONObject jsdetails = (JSONObject) details;
         System.out.println(jsdetails.get("lastName"));
         
		
	}
	

}
