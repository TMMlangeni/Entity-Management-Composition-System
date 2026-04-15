/**
@author Talani Mlangeni
@Version 37335944
*/
public class Student extends Person{
	private String status;
	
	//Default Constructor
	public Student(){
		this("0000000000000","XXX","XXX@gmail.com","  ");
	}
	// Constructor
	public Student(String id, String name, String email,String status){
		super (id,name,email);
		setStatus(status);
	}
	//Mutator for Status
	public void setStatus(String status){
		this.status = status;
	}
	//Accessor for Status
	public String getStatus(){
		return status;
	}
	//To String Method
	public String toString(){
		return  "ID: "+getId()+" Name: "+getName()+" Email: "+ getEmail()+ " Status "+ getStatus();
	}
}