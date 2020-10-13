package testwizardry;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static testwizardry.Gender.male;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HogwartsAcceptanceTestNG
{
	School school;
	List<Person> people;

	Person harry = new Wizard("Harry Potter", 11);
	Person dudley = new Muggle("Dudley Dursley", male, 11);
	Person hermione = new Witch("Hermione Granger", 11);
	Person aaron = new Person("Aaron Evans", male, 45);
	Person albus = new Wizard("Albus Dumbledore", 99);
	Person jenny = new Wizard("Jenny Weasley", 10);
	
	@BeforeMethod
	public void setup()
	{
		school = new Hogwarts();
		
		List<Person> people = new ArrayList<Person>();
		people.add(harry);
		people.add(dudley);
		people.add(hermione);
		people.add(aaron);
		people.add(albus);
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Test Done");
	}
	
	@Test
	public void shouldAcceptWizards()
	{		
		assertTrue(acceptance(harry));
	}
	
	@Test
	public void shouldRejectMuggles()
	{
		assertFalse(acceptance(dudley));
	}
	
	@Test
	public void shouldRejectWizardsTooOld()
	{
		assertFalse(acceptance(albus));
	}
	
	@Test
	public void shouldRejectWitchesTooYoung()
	{
		assertFalse(acceptance(jenny));
	}
	
	@Test
	public void shouldAcceptWitches()
	{		
		assertTrue(acceptance(hermione));
	}
	
	public boolean acceptance(Person person)
	{
		System.out.println(person);	

		boolean accepted = school.admit(person);

		if (accepted)
		{
			System.out.println("Congratulations, " + person.name + " you've been accepted to Hogwarts");
		}
		else
		{
			System.out.println("Sorry, " + person.name + " you were not accepted to Hogwarts");
		}
		
		return accepted;
	}
}
