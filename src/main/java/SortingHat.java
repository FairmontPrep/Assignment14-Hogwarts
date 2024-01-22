import java.util.ArrayList;

public class SortingHat {

	// The purpose of this class is to print out the various Hogwarts students
	//
	// Before changing the GryffindorStudent, HufflepuffStudent, RavenclawStudent, and SlytherinStudent classes, they print as:
	//  The student Hermione Granger casts a Wingardium Leviosa!
	//  The student Pansy Parkinson casts a Wingardium Leviosa!
	//  The student Luna Lovegood casts a Wingardium Leviosa!
	/// The student Cedric Diggory casts a Wingardium Leviosa!
	// After, they should print as:
	//  The Gryffindor student Hermione Granger casts a courageous Expecto Patronum!
	//  The Slytherin student Pansy Parkinson casts a devious Avada Kedavra!
	//  The Ravenclaw student Luna Lovegood casts a clever Protego Totalum!
	//  The Hufflepuff student Cedric Diggory casts a lactose intolerant Riddikulus!
	//
	// House names should be as seen above -- adjectives and spell names can be anything, so long as they are different from Wingardium Leviosa and school appropriate
	    
	public static GryffindorStudent s1 = new GryffindorStudent("Harry", "Potter");
	public static GryffindorStudent s2 = new GryffindorStudent("Hermione", "Granger");
	public static GryffindorStudent s3 = new GryffindorStudent("Ron", "Weasley");
	
	public static SlytherinStudent s4 = new SlytherinStudent("Draco", "Malfoy");
	public static SlytherinStudent s5 = new SlytherinStudent("Pansy", "Parkinson");
	public static SlytherinStudent s6 = new SlytherinStudent("Gregory", "Goyle");
	
	public static RavenclawStudent s7 = new RavenclawStudent("Cho", "Chang");
	public static RavenclawStudent s8 = new RavenclawStudent("Luna", "Lovegood");
	public static RavenclawStudent s9 = new RavenclawStudent("Padma", "Patil");
	
	public static HufflepuffStudent s10 = new HufflepuffStudent("Cedric", "Diggory");
	public static HufflepuffStudent s11 = new HufflepuffStudent("Hannah", "Abbott");
	public static HufflepuffStudent s12 = new HufflepuffStudent("Ernie", "Macmillan");
	
    // Test out your classes
	public static void main(String[] args) {
		
		ArrayList<HogwartsStudent> arrList = new ArrayList<HogwartsStudent>();
		
		arrList.add(s1);
		arrList.add(s2);
		arrList.add(s3);
		arrList.add(s4);
		arrList.add(s5);
		arrList.add(s6);
		arrList.add(s7);
		arrList.add(s8);
		arrList.add(s9);
		arrList.add(s10);
		arrList.add(s11);
		arrList.add(s12);
		
		dump(arrList);		
	}
	
	
	public static void dump(ArrayList<HogwartsStudent> a)
	{
		System.out.println("Printing contents of ArrayList:");
		for (int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}
