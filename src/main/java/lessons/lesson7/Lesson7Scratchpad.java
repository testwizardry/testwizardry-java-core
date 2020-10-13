package lessons.lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import testwizardry.Gender;
import testwizardry.MagicUser;
import testwizardry.Muggle;
import testwizardry.Person;
import testwizardry.Witch;
import testwizardry.Wizard;

public class Lesson7Scratchpad
{
	public static void main(String[] args)
	{
		String[] names = new String[3];
		names[0] = "Malfoy";
		names[1] = "Crabb";
		names[2] = "Goyle";
		System.out.println("names: " + names.length);
		System.out.println(names[0]);
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Harry");
		namesList.add("Ron");
		namesList.add("Hermione");
		System.out.println(namesList.size());
		
		for(String name : namesList)
		{
			System.out.println(name);
		}
		
		List<MagicUser> people = new ArrayList<>();
		people.add(new Wizard("Harry Potter", 11));
		people.add(new Witch("Hermione Granger", 11));
		
		System.out.println(people.get(1));
		
		// this fails
		//people.add(new Muggle("Dudley Dursley", 11));
		
		Map<Person, Boolean> admittance = new HashMap<>();
		admittance.put(new Wizard("Harry Potter", 11), true);
		admittance.put(new Witch("Hermione Granger", 11), true);
		admittance.put(new Witch("Jenny Weasley", 10), false); // too young
		admittance.put(new Wizard("Albus Dumbledore", 99), false); // too old
		admittance.put(new Person("Aaron Evans", Gender.male, 45), false); // not a wizard
		
		admittance.forEach( (person, admitted) -> { 
			System.out.println(person + (admitted ? " is " : " is not ") + "admitted to hogwarts");
		});
	}
}
