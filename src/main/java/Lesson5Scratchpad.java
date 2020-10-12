import testwizardry.Gender;
import testwizardry.Person;
import testwizardry.Witch;
import testwizardry.Wizard;

public class Scratchpad
{
	public static void main(String[] args)
	{
		Witch hermione = new Witch("Hermione Granger", 11);
		Wizard harry = new Wizard("Harry Potter", 11);
		
		Person aaron = new Person("aaron", Gender.male, 11);
		
		System.out.println(hermione);
	}
}
