package lessons.lesson5;

import testwizardry.Gender;
import testwizardry.Muggle;
import testwizardry.Person;
import testwizardry.Witch;
import testwizardry.Wizard;

public class Scratchpad
{
	public static void main(String[] args)
	{
		Witch hermione = new Witch("Hermione Granger", 11);
		Wizard harry = new Wizard("Harry Potter", 8);
		
		Person aaron = new Person("aaron", Gender.male, 44);
		Muggle dudley = new Muggle("Dudley Dursley", Gender.male, 12);
		
		System.out.println(hermione);
		System.out.println(harry);
		System.out.println(aaron);
		System.out.println(dudley);
	}
}
