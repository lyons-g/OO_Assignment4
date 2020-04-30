package ie.nuigalway.ie.ct548.assignment4.application;

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

import ie.nuigalway.ie.ct548.assignment4.controller.CCController;
import ie.nuigalway.ie.ct548.assignment4.model.CatalogContainer;
import ie.nuigalway.ie.ct548.assignment4.view.VideoCatalogView;

/**
 * this is the main driver app, it loads the JSON data from file and using mapper we map the json to classes
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




		VideoCatalogView view = new VideoCatalogView(cc); 
		CCController controller = new CCController(cc, view);
		//controller.updateView();


		System.out.println(cc.toString());

	}


}

