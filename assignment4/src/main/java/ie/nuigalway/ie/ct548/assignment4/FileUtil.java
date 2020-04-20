package ie.nuigalway.ie.ct548.assignment4;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileUtil {
	
	
	public static CatalogContainer getData() {
		
    	
   ObjectMapper mapper = new ObjectMapper();
   
      CatalogContainer cc = new CatalogContainer();
    	
       try {
    	  cc  = mapper.readValue(new File ("data.json"), CatalogContainer.class);
    	   
       } catch(JsonMappingException e) {
    	   e.printStackTrace();
       }
       catch(IOException e) {
    	   e.printStackTrace();
       }
       return cc;
    }
	
}
