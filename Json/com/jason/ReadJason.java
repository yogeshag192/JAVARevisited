package com.jason;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJason {
	
	public static JSONObject checkJSON(){
		JSONParser parser = new JSONParser();
		JSONObject jObj = null;
		
		try{
			Object obj = parser.parse(new FileReader("C:\\Users\\yogeshag\\Desktop\\Automation\\json-simple-1.1.jar\\jsonfile.txt"));
		
			jObj = (JSONObject) obj;
			
			String name = (String) jObj.get("Name");
			
			JSONArray jArray  = (JSONArray)jObj.get("Company List");
			System.out.println(name);
			System.out.println(jArray);
			Iterator it = jArray.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
			
			
		}
		catch(Exception e){
		
		}
		return jObj;
		
	}
	


	
	public static void main(String[] args) {
		JSONObject jObj = checkJSON();
		System.out.println(jObj.get("Author"));
			
}
}
