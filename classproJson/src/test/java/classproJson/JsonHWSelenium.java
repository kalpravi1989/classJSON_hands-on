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
			FileReader reader=new FileReader("/Users/balajivalveriveeraperumal/eclipse-workspace/classproJson/src/test/resources/Selenium.json");
			Object obj=jsonParser.parse(reader);
			JSONObject seleniumFeature=(JSONObject)obj;
			System.out.println(seleniumFeature);
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
		JSONArray action=(JSONArray)(feat.get("Action Class"));
		for(Object obj1:action) {
			JSONObject ac=(JSONObject) obj1;
			System.out.println(ac.get("Actions"));
		}

		JSONArray locators=(JSONArray)(feat.get("Loactors"));
		System.out.println(locators.get(2));

		System.out.println(feat.get("browserdetails"));




	}



}


