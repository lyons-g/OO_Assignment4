package ie.nuigalway.ie.ct548.assignment4;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args ) throws JsonParseException, IOException
    {  	
    	    	
   CatalogContainer cc = new CatalogContainer();
   ObjectMapper mapper = new ObjectMapper();
   
   try { cc = mapper.readValue(new File ("data.json"), CatalogContainer.class);
   
   }
   catch(JsonParseException e) {
	   e.printStackTrace();
   }catch(JsonMappingException e) {
	   e.printStackTrace();
   }catch(Exception e) {
	   e.printStackTrace();
   }
    	

   
    ProfileSelectionView view = new ProfileSelectionView(cc);
    CCController controller = new CCController(cc, view);
    //controller.updateView();
    

   
    
    }

      
    }

