# Part 4: Documentation



# 1 
Describe the reasoning behind your design choices in terms of design patterns, classes, and user interaction.

Inline with assignment requirements I created an MVC application using the JavaSwing framework. Data was loaded from a Json file and mapped to various classes. The CatalogContainer class holds the information in the form of ArrayList or TreeSet and acts as the model. One controller was created, CCController.java, that accesses this data directly. The controller contains various methods for the manipulation of the data and for providing this data to the various userinterface views. A Factory patterrn was implemented to create new media items of TvSeries or Flim. 


# 2.
Describe the test scenarios that you have created and their objectives.

Test scenarios created created include a combination of unit test and intergration testo of each class in the model. At the basic unit test level simple creation of new objects, using setters to assign attributes and testing if infact the correct object was created and the assignments were correct. For example, in FilmTest.java the aim was to test the film class. The following test is an example of one unit test for film.

    @Test 
	public void testGetFid() {
		Film f1 = new Film();
		f1.setFid(1);
		
		assertTrue(f1.getFid() == 1);
	}
A new film is created, and the film id (Fid) is set to 1. 
The assertTrue(f1.getFid()==1); if passed confirms that the creation of the new film object was successful and that the Fid was also assigned correctly. 

Examples of a intergration test can be seen throughout the test classes. One such example is in the CatalogContainerTest.
	
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
This integration test asses if the sortBy ( ) method created in the code is sucessful in storing the MediaItem Object in the correct order, by Year accesending. 

# 3 
Provide a small guide for the using the system (i.e. help for the user)

1. From the intial screen please select the Switch Profile Button.
2. Please select one of the user profiles
3. Browser the video catalog of your selected user, including media items based on perference of the user profile selected
4. For more information on any of the media items on screen please click on the link to show more details
5. At any stage you can also select the Add New button to add a new media item to the library, or the List by Year or Genre functions to view all of the library based on year or Genre.


# 4
Discuss how the media item creation subsystem can be extended to create movies and series that are physical (e.g. on DVD or Blu-ray) separate from digital ones (e.g. streaming or downloadable files).

To current media item creation subsystem is a standard Factory Method. If I were to extend this to include multiple types of different object types, an Abstract Factory Pattern would be a good implementation. The goal of an Abstract Factory is to group several factory methods into a single calss with the aim of creating multiple types of objects. 

# 5
Discuss at least one more way in which the system can be extended.
An simlpe system extension would be to allow the creation of user accounts, that would store information for the individual user. The system would require a log in option, where the user can log into there own account, save their perference and add to their own collections. 

