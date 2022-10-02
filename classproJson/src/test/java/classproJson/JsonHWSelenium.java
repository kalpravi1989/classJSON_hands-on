package classproJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonHWSelenium {

	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();

		try {
			FileReader reader=new FileReader("./src/test/resources/Selenium.json");
			Object obj=jsonParser.parse(reader);
			JSONObject seleniumFeature=(JSONObject)obj;
			System.out.println(seleniumFeature);
			System.out.print("number of objects in JSON: ");
			System.out.println(seleniumFeature.size());

			objectExtractor(seleniumFeature);


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
		JSONObject feat=(JSONObject)obj;
		//System.out.println(feat.get("Action Class"));
		System.out.print("Action class of selenium :");
		JSONArray action=(JSONArray)(feat.get("Action Class"));
		for(Object obj1:action) {
			JSONObject ac=(JSONObject) obj1;
			System.out.println(ac.get("Actions"));
		}


		JSONArray locators=(JSONArray)(feat.get("Loactors"));
		System.out.println("Third element of locators: "+locators.get(2));

		System.out.println("Browser details in array format: "+feat.get("browserdetails"));




	}



}


