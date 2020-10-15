package testwizardry;

import static org.testng.Assert.*;
import static testwizardry.Gender.*;

import org.testng.annotations.Test;

public class WizardTest
{
	Person harry = new Wizard("Harry Potter", 11);
	Person hermione = new Witch("Hermione Granger", 11);
	Person dudley = new Muggle("Dudley Dursley", Gender.male, 11);

	@Test
	public void shouldBeAMagicUser()
	{
		assertTrue(harry instanceof MagicUser);
		assertTrue(hermione instanceof MagicUser);
		assertFalse(dudley instanceof MagicUser);
	}
	
	@Test
	public void shouldBeAPerson()
	{
		assertTrue(harry instanceof Person);
		assertTrue(hermione instanceof Person);
		assertFalse(dudley instanceof Person); //fails
	}
	
	@Test
	public void shouldNotBeAMuggle()
	{
		assertFalse(harry instanceof Muggle);
		assertFalse(hermione instanceof Muggle);
		assertTrue(dudley instanceof Muggle);
	}
	
	@Test
	public void aWizardIsMale()
	{
		assertTrue(harry.gender == male);
	}
}
