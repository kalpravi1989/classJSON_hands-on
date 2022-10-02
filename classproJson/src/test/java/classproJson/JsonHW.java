package classproJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonHW {

	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();

		try {
			FileReader reader=new FileReader("./src/test/resources/java.json");
			Object obj=jsonParser.parse(reader);
			JSONObject javaFeature=(JSONObject)obj;
			
			

			objectExtractor(javaFeature);


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
		System.out.println("Full Features of java:"+ "\n"+feat.get("Features"));          //prints full features of java
		JSONObject ftopics=(JSONObject)feat.get("Features");
		
		System.out.println("Full control statemt of java:"+"\n"+ftopics.get("Control Statement")); //prints full Control statement
		
		
		JSONObject conStat =(JSONObject) ftopics.get("Control Statement");
		System.out.println("Control Statement-loops"+"\n"+conStat.get("Loop"));                  //prints Control statement loops
		JSONArray loop=(JSONArray)conStat.get("Loop");
		for(Object obj1: loop) {
			System.out.println(obj);
			
		}
		
		
	}



}
