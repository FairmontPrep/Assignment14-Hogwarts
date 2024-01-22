
// Generic student class -- this class can apply to students in just about any school

public class Student {

	// Check out how static numbers can be used to create unique IDs
	private static int ID = 1;
	
	private String firstName;
	private String lastName;
	public int number;
	
	public Student (String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = id;
	}
	
	public Student (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		number = getNextAvailableID();
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	public int getNextAvailableID()
	{
		return ID++;
	}
	
	public String toString()
	{
		return getName() + " id # " + number;
	}
}
