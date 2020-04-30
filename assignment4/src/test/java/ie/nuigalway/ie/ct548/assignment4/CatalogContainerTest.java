package ie.nuigalway.ie.ct548.assignment4;

import static org.junit.Assert.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

import ie.nuigalway.ie.ct548.assignment4.model.Film;
import ie.nuigalway.ie.ct548.assignment4.model.MediaItem;

public class CatalogContainerTest {


	@Test
	public void testSetGenres() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMediaitems() {
		ArrayList<MediaItem> mediaitems = new ArrayList<MediaItem>();

		MediaItem f1 = new Film();
		f1.setTitle("one");
		MediaItem f2 = new Film();
		f2.setTitle("two");
		MediaItem t1 = new Film();
		t1.setTitle("three");
		MediaItem t2 = new Film();
		t2.setTitle("four");	

		mediaitems.add(f1);
		mediaitems.add(f2);
		mediaitems.add(t1);
		mediaitems.add(t2);

		int result = mediaitems.size();

		assertTrue(result == 4);

		assertTrue("one" == f1.getTitle());
	}

	@Test 
	public void sortByTestDoesNotAllowDupilcates() {
		
		TreeMap<Year, MediaItem> sorted = new TreeMap<Year, MediaItem>(Collections.reverseOrder());

		MediaItem f1 = new Film();
		f1.setTitle("aaaa");
		f1.setYear(Year.of(1980));
		MediaItem f2 = new Film();
		f2.setTitle("zzzz");
		f2.setYear(Year.of(2020));
		
		sorted.put(f1.getYear(),f1);
		sorted.put(f2.getYear(),f2);
		sorted.put(f1.getYear(), f1);
		
		int result = sorted.size();
		
		assertTrue(result == 2);
				

	}
	
	
	@Test 
	public void sortByTestSortAccordingToYear() {
		
		TreeMap<Year, MediaItem> sorted = new TreeMap<Year, MediaItem>(Collections.reverseOrder());

		MediaItem f1 = new Film();
		f1.setTitle("aaaa");
		f1.setYear(Year.of(1980));
		MediaItem f2 = new Film();
		f2.setTitle("zzzz");
		f2.setYear(Year.of(2020));
		MediaItem f3 = new Film();
		f3.setTitle("xxxx");
		f3.setYear(Year.of(2000));
		
		
		sorted.put(f1.getYear(),f1);
		sorted.put(f2.getYear(),f2);
		sorted.put(f3.getYear(), f3);
		
		
		
		assertEquals("[2020, 2000, 1980]", sorted.keySet().toString());
				

	}


}
