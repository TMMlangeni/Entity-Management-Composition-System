/**
@author Talani MLangeni
@version 37335944
*/
public class Address{
	private String addressLine1;
	private String addressLine2;
	
	public Address(){
		this("");
	}
	public Address(String newAddress){
		
		String [] addressLines = newAddress.split(",");
		if(addressLines.length == 2){
			setAddressline1(addressLines[0]);
			setAddressline2(addressLines[1]);
		}
		else{
			setAddressline1("");
			setAddressline2("");
		}
		
	}
	public void setAddressline1(String line1){
		this.addressLine1 = line1;
		
	}
	public void setAddressline2(String line2){
		this.addressLine2 = line2;
	}
	
	public String getAddressLine1(){
		return addressLine1;
	}
	public String getAddressLine2(){
		return addressLine2;
	}
	public String getAddress(){
		return getAddressLine1() + "\n" +getAddressLine2()+"\n";
	}
	public String toString(){
		return getAddress();
	}
	public static void main(String [] args){
		
		Address myAddress = new Address(" 1642 Hawk Crescent, Lenasia South");
		System.out.println("myAddress: \n\n"+ myAddress.getAddress());
		
		Address none = new Address();
		System.out.println("none"+ none.getAddress());
		
	}

}