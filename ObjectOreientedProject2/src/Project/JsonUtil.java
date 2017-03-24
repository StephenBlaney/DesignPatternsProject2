package Project;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtil {
	String jerseyD = "",jerseyName="",jerseyI="",supplementName="",supplementD="",supplementI="";
	String equipmentName = "",equipmentD = "",equipmentI="",womenName= "",womenD="",womenI="",jerseyComp="";
	String supplementComp = "",equipmentComp ="",womenComp="";
	//--------------------------------JERSEY EXTRACT JSON DATA -----------------------------//
	public String getJersey(){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("Jersey");
			JSONObject o = (JSONObject)array.get(0);
			jerseyName = (String) o.get("Name");
		} catch(Exception e1){
			e1.printStackTrace();
		}
		return jerseyName;
	}
	
	public String getJerseyDescription(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("JerseyDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			jerseyD = (String) o.get("Description");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return jerseyD;
	}
	
	public String getJerseyImage(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("JerseyDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			jerseyI = (String) o.get("Image");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return jerseyI;
	}
	
	//--------------------------------SUPPLEMENT EXTRACT JSON DATA -----------------------------//
	
	public String getSupplement(){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("Supplement");
			JSONObject o = (JSONObject)array.get(0);
			supplementName = (String) o.get("Name");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return supplementName;
	}
	
	public String getSupplementDescription(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("SupplementDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			supplementD = (String) o.get("Description");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return supplementD;
	}
	
	public String getSupplementImage(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("SupplementDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			supplementI = (String) o.get("Image");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return supplementI;
	}
	
	//--------------------------------------- EQUIPEMENT EXTRACT JSON DATA ---------------------//
	
	public String getWomen(){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("Women");
			JSONObject o = (JSONObject)array.get(0);
			womenName = (String) o.get("Name");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return womenName;
	}
	
	public String getWomenDescription(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("WomenDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			womenD = (String) o.get("Description");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return womenD;
	}
	
	public String getWomenImage(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("WomenDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			womenI = (String) o.get("Image");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return womenI;
	}
	
	//---------------------------------------------WOMEN EXTRACT JSON DATA ----------------------//
	
public String getEquipment(){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("Equipment");
			JSONObject o = (JSONObject)array.get(0);
			equipmentName = (String) o.get("Name");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return equipmentName;
	}
	
	public String getEquipmentDescription(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("EquipmentDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			equipmentD = (String) o.get("Description");
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return equipmentD;
	}
	
	public String getEquipmentImage(int index){
		
		String file = "content.json";
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("EquipmentDetails");
			
			
			JSONObject o = (JSONObject)array.get(index);
			equipmentI = (String) o.get("Image");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return equipmentI;
	}//end equipment
	
	public String getJerseyComp(int index){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("JerseyComp");
			JSONObject o = (JSONObject)array.get(index);
			jerseyComp = (String) o.get("CompMsg");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return jerseyComp;
	}
	
	public String getSupplementComp(int index){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("SupplementComp");
			JSONObject o = (JSONObject)array.get(index);
			supplementComp = (String) o.get("CompMsg");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return supplementComp;
	}
	
	public String getEquipmentComp(int index){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("EquipmentComp");
			JSONObject o = (JSONObject)array.get(index);
			equipmentComp = (String) o.get("CompMsg");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return equipmentComp;
	}
	
	public String getWomenComp(int index){
		
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray array = (JSONArray) jsonObject.get("WomenComp");
			JSONObject o = (JSONObject)array.get(index);
			womenComp = (String) o.get("CompMsg");
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return womenComp;
	}
}
