package ie.nuigalway.ie.ct548.assignment4.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "pid", scope = Person.class)
public class Person {

	private int pid;
	private String name; 
	
	public Person() {
		
	}
	
	public Person(int pid) {
		this.pid = pid;
		this.name = getName();
		
	}

	public Person(String person) {
		this.name = person;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
	
	
}
