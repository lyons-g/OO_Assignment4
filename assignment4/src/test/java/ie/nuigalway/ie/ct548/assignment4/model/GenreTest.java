package ie.nuigalway.ie.ct548.assignment4.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenreTest {

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
	public void testGenreJsonData() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData();

		assertNotNull(json.getGenres());
		
		int result = json.getGenres().size();
		assertTrue("Expected to be 9 genre loaded from Json Data", result == 9);
		
		
	}


	@Test
	public void testCreateNewGenreAndAddToNewFilmAndTestGettersAndSetters() {
	
		Genre g1 = new Genre();
		g1.setGenre("Gold");
		g1.setGid(24);
		
		Genre g2 = new Genre();
		g2.setGenre("Magic");
		g2.setGid(55);
		
		assertTrue(g1.getGid()==24);
		assertTrue(g1.getGenre()=="Gold");
		
		Film f1 = new Film();
		ArrayList<Genre> genres = new ArrayList<Genre>();
		genres.add(g1);
		genres.add(g2);
	
		f1.setGenre(genres);
		
		assertTrue("Expected 2 genres associated with Film f1",f1.getGenre().size()==2);
		assertTrue("G2 is expected to be in the Genre array for film f1",f1.getGenre().contains(g2));
	}

}
