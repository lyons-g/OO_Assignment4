package ie.nuigalway.ie.ct548.assignment4.modelTests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ie.nuigalway.ie.ct548.assignment4.model.CatalogContainer;
import ie.nuigalway.ie.ct548.assignment4.model.Genre;
import ie.nuigalway.ie.ct548.assignment4.model.Profile;

public class ProfileTest {


	public CatalogContainer getJsonData() throws JsonParseException, IOException{
		CatalogContainer json = null;
		ObjectMapper mapper = new ObjectMapper();
		try {	json = mapper.readValue(new File("data.json"), CatalogContainer.class);
		}
		   catch(JsonParseException e) {
			   e.printStackTrace();
		   }catch(JsonMappingException e) {
			   e.printStackTrace();
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		
		return json;
	}
	
		
	@Test
	public void testProfileJsonDataFindFirstProfileInFirstPositonAndAssertThatNameAndGenreMatch() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData();

		assertNotNull(json.getProfiles());
		
		int result = json.getProfiles().size();
		assertTrue("Expected to be 4 profiles loaded from Json Data", result == 4);
		
		Profile p = json.getProfiles().iterator().next();
		String name = p.getName();
		Genre preferredGenre = p.getPreferredGenre();
		
		assertTrue(p.equals(json.getProfiles().get(0)));
		assertTrue(name.equals("Mewtwo"));
		assertTrue(preferredGenre.getGid()==(6));
	
	}

	
}
