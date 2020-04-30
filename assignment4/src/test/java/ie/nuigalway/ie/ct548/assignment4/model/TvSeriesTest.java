package ie.nuigalway.ie.ct548.assignment4.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TvSeriesTest {

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
	public void testTvSeriesDataIsLoadedFromJsonFile() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData();
		
		assertNotNull(json.getTvseries());
		
		int total = 4;
		
		assertTrue("expected 4 films to be in json data", total == json.getTvseries().size());
		
	}
	
	@Test
	public void testCreateNewTvSeriesFromAbstractClassMediaAndTestingInheritedMethods() {
		
		
		MediaItem m1 = new TvSeries();
		m1.setTitle("TestTitle");
		
		assertTrue("expected film title to be returned", m1.getTitle().equals("TestTitle"));
		
	}


	@Test
	public void testSetCreatorAndSetDescriptionOfNewTvSeries() {
		Person p1 = new Person("Darth Vador");
		TvSeries t1 = new TvSeries();
		t1.setCreator(p1);
		t1.setDescription("Good Stuff");
	
		assertTrue("expected creator to be returned", t1.getDirector().equals(p1));
		assertTrue("Expected Strings to be equals", t1.getDescription().equals("Good Stuff"));
	
	}


}
