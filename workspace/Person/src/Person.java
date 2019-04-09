
public class Person {
	int index;
	String firstName;
	String lastName;
	String gender;
	
	
	public Person(){}
	public Person(int index, String firstName, String lastName, String gender){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getGender(){
		return this.gender;
	}
	public int getIndex(){
		return this.index;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setIndex(int index){
		this.index = index;
	}
	public String toString(){
		return index + " " + this.firstName + " " + this.lastName + " " + this.gender;
	}
}
