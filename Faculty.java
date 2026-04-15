/**
@author Talani Mlangeni
@Version 37335944
*/
public class Faculty extends Employee{
	
	private String rank;
	
	//Default Constructor
	public Faculty(){
		this("0000000000000","XXX","XXX@gmail.com","  ", " ");
	}
	//Constructor 
	public Faculty(String id, String name, String email,String rank, String office){
		super(id,name,email,office);
		setRank(rank);
	}
	//Mutator for Rank
	public void setRank(String rank){
		this.rank = rank;
	}

	//Accessor for Rank
	public String getRank(){
		return rank;
	}
	//To String Method
	public String toString(){
		return "ID: "+getId()+" Name: "+getName()+" Email: "+ getEmail()+ " Rank: "+getRank()+ " Office: "+getOffice();
	}
	
}