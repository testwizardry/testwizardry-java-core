package testwizardry;

import static testwizardry.Gender.*;

import java.util.ArrayList;
import java.util.List;

public class HogwartsAcceptanceTest
{
	public static void main(String[] args)
	{
		School hogwarts = new Hogwarts();
		
		Person harry = new Wizard("Harry Potter", 11);
		Person dudley = new Muggle("Dudley Dursley", male, 11);
		Person hermione = new Witch("Hermione Granger", 11);
		Person aaron = new Person("Aaron Evans", male, 45);
		Person albus = new Wizard("Albus Dumbledore", 99);

		List<Person> people = new ArrayList<Person>();
		people.add(harry);
		people.add(dudley);
		people.add(hermione);
		people.add(aaron);
		people.add(albus);
		
		for(int i=0; i<people.size(); i++)
		{	
			Person person = people.get(i);
			
			if (hogwarts.accept(person))
			{
				System.out.println("Congratulations, " + person.name + " you've been accepted to Hogwarts");
			}
			else
			{
				System.out.println("Sorry, " + person.name + " you were not accepted to Hogwarts");
			}
		}
	}
}
