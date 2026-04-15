/**
@author Talani Mlangeni
@Version 37335944
*/
public class Person{

	private String id;
	private Name name;
	private String email;
	private Address address;
		
	public Person() 
	{
		this("00000000","","","");
	}

	public Person(String id, String name, String email, String address) 
	{
		setId(id);
		setName(name);
		setEmail(email);
		setAddress(address);
	}

  public void setId(String id)
  {
	this.id = id;
  }

  public void setName(String newName)
  {
	name = new Name(newName);
  }
  
  public void setEmail(String email)
  {
	this.email = email;
  }
  
  public void setAddress(String newAddress)
  {
	address = new Address(newAddress);
  }

  public String getId()
  {
	return id;
  }

  public Name getName()
  {
	return name;
  }
 
  public String getEmail()
  {
	return email;
  }
  
  public Address getAddress()
  {
	return address;
  }

  public String toString()
  {
	return "Person ID: "+getId()+", Name: "+getName().getFullName()+", eMail: "+getEmail()+" and Address: "+getAddress().getAddress();
  }
  
  public static void main(String[] args)
  {
    //Address a1 = new Address("My Res,University Town");
    Person s1 = new Person("53456785","Clever,C,Clive","clever.clive@gmail.com","My Res,University Town");
    System.out.println("s1: "+s1);
    System.out.println("Name of s1 = "+s1.getName());
    System.out.println("and address\n"+s1.getAddress());
  
    System.out.println();
  
   // Address a2 = new Address("CS Dept,University Place");
    Person pp = new Person("53476585","Prof,,Piet","prof.piet@gmail.com","CS Dept,University Place");
    System.out.println("pp: "+pp);
    System.out.println("Name of pp = "+pp.getName());
    System.out.println("and address\n"+pp.getAddress());
   
        
  }
}