/**
@author Talani Mlangeni
@Version 37335944
*/

public class Name{
	
	private String firstName;
	private String initials;
	private String surname;
	
	public Name(){
		this("");
	}
	public Name(String newName){
		String [] nameParts = newName.split(","); 
		if (nameParts.length == 3){
			set1stName(nameParts[0]);
			setInitials(nameParts[1]);
			setSurname(nameParts[2]);
		}
		else{
			set1stName("");
			setInitials("");
			setSurname("");
		}
		
	}
	public void set1stName(String fname){
		this.firstName = fname;
	}
	public void setInitials(String initials){
		this.initials = initials;
	}
	public void setSurname(String sname){
		this.surname = sname;
	}
	public String get1stName(){
		return firstName;
	}
	public String getInitials(){
		return initials;
	}
	public String getSurname(){
		return surname;
	}
	public String getFullName(){
		return get1stName()+" ,"+getInitials()+" ,"+ getSurname() +"\n";
	}
	public String toString(){
		return getFullName();
	}
	public static void main(String [] args){
		Name myName = new Name("Talani,TM,Mlangeni");
		System.out.println("My name is: "+ myName.getFullName());
		
		Name herName = new Name("Thuli,NT,Mbuyisa");
		System.out.println("Her name is: "+herName.getFullName());
		
		Name none = new Name();
		System.out.println("none: "+ none.get1stName());
	}
	
	
}