package ie.nuigalway.ie.ct548.assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FileUtilTest extends TestCase {

	
	public void testGetData() throws JsonProcessingException {
	CatalogContainer catalog = FileUtil.getData();
		System.out.println(catalog);
		assertNotNull(catalog);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(catalog));
	}

}
