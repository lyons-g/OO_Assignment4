package ie.nuigalway.ie.ct548.assignment4;

import static org.junit.Assert.*;

import java.time.Year;

import org.junit.Test;

import ie.nuigalway.ie.ct548.assignment4.model.Film;
import ie.nuigalway.ie.ct548.assignment4.model.MediaItem;
import ie.nuigalway.ie.ct548.assignment4.model.Person;

public class MediaItemTest {

	@Test
	public void shouldSortCorrectlyWhenTitlesAreDifferent() {
		MediaItem m1 = new Film();
		m1.setTitle("zzzzzz");
		m1.setYear(Year.of(2020));

		MediaItem m2 = new Film();
		m2.setTitle("aaaaaa");
		m2.setYear(Year.of(2020));
		
		int result = m1.compareTo(m2);
		
		assertTrue("expected to be greater than", result >= 1);
		

	}

	
	@Test
	public void shouldSortCorrectlyWhenYearsAreDifferent() {
		MediaItem m1 = new Film();
		m1.setTitle("zzzzzz");
		m1.setYear(Year.of(2022));

		MediaItem m2 = new Film();
		m2.setTitle("zzzzzz");
		m2.setYear(Year.of(2020));
		
		int result = m1.compareTo(m2);
		
		assertTrue("expected to be greater than", result >= 1);
		

	}
	
	
	@Test
	public void shouldSortCorrectlyWhenObjectsAreTheSame() {
		MediaItem m1 = new Film();
		m1.setTitle("zzzzzz");
		m1.setYear(Year.of(2022));

		MediaItem m2 = new Film();
		m2.setTitle("zzzzzz");
		m2.setYear(Year.of(2022));
		
		int result = m1.compareTo(m2);
		
		assertTrue("expected to be 0", result == 0);
		

	}
	

	
	@Test
	public void testGetDirector() {
		Person p1 = new Person("Han Solo");
		
		MediaItem m1 = new Film();
		m1.setDirector(p1);
		
		assertTrue("expected director to be returned", m1.getDirector().equals(p1));
		
	}
	
	

}
