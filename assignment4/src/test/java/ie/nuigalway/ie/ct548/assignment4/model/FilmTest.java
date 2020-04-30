package ie.nuigalway.ie.ct548.assignment4.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilmTest {

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
	public void testFilmDataIsLoadedFromJsonFile() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData();
		
		assertNotNull(json.getFilms());
		
		int total = 4;
		
		assertTrue("expected 4 films to be in json data", total == json.getFilms().size());
		
	}

	@Test
	public void testGetFid() {
		Film f1 = new Film();
		f1.setFid(1);
		
		assertTrue(f1.getFid() == 1);
	}

	
	@Test
	public void testCreateNewFilmFromAbstractClassMediaAndTestingInheritedMethods() {
		
		
		MediaItem m1 = new Film();
		m1.setTitle("TestTitle");
		
		assertTrue("expected film title to be returned", m1.getTitle().equals("TestTitle"));
		
	}

	@Test
	public void testGetMediaItemsFromJsonAndTestAddingMediaItemsToJson() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData(); 
		
		int result = json.getMediaitems().size();
		
		assertTrue("expected 8 mediaitems to be in Json data", result == 8);
		
		int size = json.getMediaitems().size();
		MediaItem m = new Film();
		json.addMediaItem(m);

		int newSize = json.getMediaitems().size();
		assertTrue("expected newSize to be greater than size", size < newSize );
		
		
		
	}

	@Test
	public void testSetDirectorAndSetDescriptionOfNewFilm() {
		Person p1 = new Person("Luke Skywalker");
		Film m1 = new Film();
		
		m1.setDirector(p1);
		m1.setDescription("Not too bad");
		
		assertTrue("expected director to be returned", m1.getDirector().equals(p1));
		assertTrue("Expected Strings to be eqauls", m1.getDescription().equalsIgnoreCase("not too bad"));
				
		
	}
}