package jsonSimple;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.data.dynamic.FakerDataFactory;


public class jsonDataCreator {
	
	@Test	
	public void jsondata1() throws IOException {
	JSONObject obj = new JSONObject();
	obj.put("short_description",FakerDataFactory.getShortDesc());
	obj.put("description",FakerDataFactory.getShortDesc());
	FileWriter file = new FileWriter("data\\TC001.json", false);
	file.write(obj.toJSONString());
	file.close();
	
}
	@Test		
	public void jsondata2() throws IOException {
	JSONObject obj = new JSONObject();
	obj.put("short_description",FakerDataFactory.getShortDesc());
	obj.put("description",FakerDataFactory.getShortDesc());
	FileWriter file = new FileWriter("data\\TC002.json", false);
	file.write(obj.toJSONString());
	file.close();
	
}
}