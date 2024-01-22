
// Generic Hogwarts class -- this class applies to students at the Hogwarts School of Witchcraft and Wizardry 

public class HogwartsStudent extends Student{
	
	public HogwartsStudent(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public String castSpell()
	{
		return "Wingardium Leviosa!";
	}
	
	public String toString()
	{
		return "The " + getHouseString() + " student " + getName() + " casts a " + getHouseAdjective() + " " + castSpell();
	}
	
	public String getHouseString()
	{
		return "";
	}
	
	public String getHouseAdjective()
	{
		return "";
	}
}
