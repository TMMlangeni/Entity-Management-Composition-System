/**
@author Talani Mlangeni
@Version 37335944
*/
public class Employee extends Person {

	private String office;
	
	//Default Constructor
	public Employee(){
		this("0000000000000","XXX","XXX@gmail.com","  ");
	}
	//Constructor 
	public Employee(String id, String name, String email, String office){
		super(id,name,email);
		
		setOffice(office);
	}
	
	//Mutator for Office
	public void setOffice(String office){
		this.office = office;
	}
	
	// Accessor for Office
	public String getOffice(){
		return office;
	}
	//To String Method
	public String toString(){
		return "ID: "+getId()+" Name: "+getName()+" Email: "+ getEmail()+ " Office: "+getOffice();
	}
	
}