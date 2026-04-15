/**
@author Talani Mlangeni
@Version 37335944
*/
public class Staff extends Employee{
	private String title;
	
	//Defualt Constructor
	public Staff (){
		this("0000000000000","XXX","XXX@gmail.com","","");
	}
	//Constructor
	public Staff(String id, String name, String email, String office,String title){
		super(id,name,email,office);
		setTitle(title);
	}
	// Mutator for Title
	public void setTitle(String title){
		this.title = title;
	}
	// Accessor for Title 
	public String getTitle(){
		return title;
	}
	//To String Method
	public String toString(){
		return "ID: "+getId()+" Name: "+getName()+" Email: "+ getEmail()+ " Office: "+getOffice()+" Title: "+getTitle();
	}
}