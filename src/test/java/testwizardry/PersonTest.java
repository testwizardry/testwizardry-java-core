package testwizardry;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static testwizardry.Gender.*;

public class PersonTest
{
	Person harry = new Person("Harry Potter", male, 11);
	Person hermione = new Person("Hermione Granger", female, 11);
	Person albus = new Person("Albus Dumbledore", male, 99);
	
	@Test
	public void shouldHaveName()
	{
		assertEquals(harry.name, "Harry Potter");
		assertEquals(hermione.name, "Hermione Granger");
	}

	@Test
	public void shouldGiveFirstName()
	{
		assertEquals(harry.getFirstName(), "Harry");
		assertEquals(hermione.getFirstName(), "Hermione");
	}
	
	@Test
	public void shouldGiveLastName()
	{
		assertEquals(harry.getLastName(), "Potter"); // failing -- bug
		assertEquals(hermione.getLastName(), "Granger");
	}
	
	@Test 
	public void shouldHaveAge()
	{
		assertEquals(harry.getAge(), 11);
		assertEquals(albus.getAge(), 99);
	}
	
	@Test
	public void shouldBeAbleToChangeAge()
	{
		harry.setAge(12);
		assertEquals(harry.getAge(), 12); // failing -- test race condition
	}
	
	@Test 
	public void shouldHaveGender()
	{
		assertEquals(harry.getGender(), male);
		assertEquals(hermione.getGender(), female);
	}
	
}
