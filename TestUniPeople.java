public class TestUniPeople 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Testing class Student:");
		Student s1 = new Student();
		System.out.println("Student s1: "+s1);
		s1.setId("87654321");
		s1.setName("Andy Travis");
		s1.setStatus("Senior");
		s1.setEmail("andy.travis@wmail.org");
		System.out.println("Student s1 after calling set methods: "+s1.getId()+ " "+s1.getName()+", "+s1.getStatus()+", "+s1.getEmail());		
		Student s2 = new Student("12345678","Les Nessman","les.nessman@wmail.edu");
		System.out.println("Student s2: "+s2+"\n NOTE that Status is an empty String!");
		s2.setStatus("Post graduate");
		System.out.println("Student s2 after calling setStatus method: "+s2);
		
		System.out.println("\nTesting class Faculty:");
		Faculty f1 = new Faculty();
		System.out.println("Faculty f1: "+f1+"\n NOTE that Office has the value null!");
		f1.setId("87654321");
		f1.setName("Jennifer Marlow");
		f1.setRank("Professor");
		f1.setOffice("G3 G226");
		f1.setEmail("jennifer.marlow@wmail.org");
		System.out.println("Faculty f1 after calling set methods: "+f1.getId()+ " "+f1.getName()+", "+f1.getRank()+", "+f1.getOffice()+", "+f1.getEmail());		
		Faculty f2 = new Faculty("12345678", "Johnny Fever", "johnny.fever@wmail.edu","Dr");
		System.out.println("Faculty f2: "+f2+"\n NOTE that Office has the value null!");
		f2.setOffice("G9 929");
		System.out.println("Faculty f2 after calling setOffice method: "+f2);
	
		System.out.println("\nTesting class Staff:");
		Staff st1 = new Staff();
		System.out.println("Staff st1: "+st1+"\n NOTE that Office has the value null!");
		st1.setId("87654321");
		st1.setName("Bailey Quarters");
		st1.setTitle("Ms");
		st1.setOffice("G2 G106");
		st1.setEmail("bailey.quarters@wmail.org");
		System.out.println("Staff st1 after calling set methods: "+st1.getId()+ " "+st1.getName()+", "+st1.getTitle()+", "+st1.getOffice()+", "+st1.getEmail());		
		Staff st2 = new Staff("12345678", "Arthur Carlson", "big.guy@wmail.edu", "Mr");
		System.out.println("Staff st2: "+st2+"\n NOTE that Office has the value null!");
		st2.setOffice("G1 129");
		System.out.println("Staff st2 after calling setOffice method: "+st2);
		
	}
}