package ie.nuigalway.ie.ct548.assignment4.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonTest {

	
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
	public void testPeopleJsonData() throws JsonParseException, IOException {
		CatalogContainer json = getJsonData();

		assertNotNull(json.getPeople());
		
		int result = json.getPeople().size();
		assertTrue("Expected to be 29 people loaded from Json Data", result == 29);
		
		
	assertNotNull("Expected there is people in cast of media item in position 0",json.getMediaitems().get(0).getCast());
	assertTrue("Expected that the director of the media item at postion 0 is of class type Person",json.getMediaitems().get(0).getDirector().getClass().equals(Person.class));
	
	}

	
	
	@Test
	public void testPerson() {
		Person p1 = new Person();
		p1.setName("Tom");
		p1.setPid(45);
		
		assertTrue("Expected getPid to be equal to 45",p1.getPid()==45);
		assertTrue(p1.getName().contentEquals("Tom"));
		
		Person p2 = new Person();
		p2.setName("Mike");
		p2.setPid(48);
		
		TvSeries t1 = new TvSeries();
		ArrayList<Person> cast = new ArrayList<Person>();
		cast.add(p1);
		cast.add(p2);
		
		t1.setCast(cast);
		
		
		assertTrue("Expected to members in the cast", t1.getCast().size()==2);
		assertTrue("P2 is expected to be in the Cast", t1.getCast().contains(p2));
		
		
	}
}