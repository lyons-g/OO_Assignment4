package ie.nuigalway.ie.ct548.assignment4;

import java.io.File;
import java.io.IOException;
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
	//static CatalogContainer json;
	
    public static void main( String[] args ) throws JsonParseException, IOException
    {  	
    	
    	Profile m = new Profile();
    	ProfileSelectionView v = new ProfileSelectionView("Profile Selection");
    	ProfileController c = new ProfileController(m, v);
    
    	
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
    	
    System.out.println(cc);
    }
}
      
      
      
      /*   
      try {
    	   cc = mapper.readValue(new File ("data.json"), CatalogContainer.class);
    	   
       } catch(JsonMappingException e) {
    	   e.printStackTrace();
       }
       System.out.println(mapper.writeValueAsString(cc));
    }
}
    
    
    	MediaItemFactory mediaFactory = new MediaItemFactory();
    	
    	MediaItem theMedia = null;
    	
    //	mediaItem film = new film();
       
       Scanner userInput = new Scanner(System.in);
       System.out.println("What type of media item ? F or T ");
       
       if(userInput.hasNextLine()) {
    	   
    	   String typeOfMedia = userInput.nextLine();
    	   
    	   theMedia = mediaFactory.createMediaItem(typeOfMedia);
       
       if(theMedia != null) {
    	   doStuff(theMedia);
    	   
       }else
    	   System.out.println("Enter F or T");
       }
      
    }
    
    public static void doStuff(MediaItem aMediaItem) {
    	
    	aMediaItem.TestTitle();
    	aMediaItem.TestYear();
    }
}
*/