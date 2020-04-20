package ie.nuigalway.ie.ct548.assignment4;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "pid", scope = People.class)
public class People {

	private int pid;
	private String name; 
	
	
	public People(int pid, String name) {
		this.pid = pid;
		this.name = name;
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
	
	
}
