package testwizardry;

import static org.testng.AssertJUnit.assertTrue;
import static testwizardry.Gender.*;

import org.testng.annotations.Test;

public class WizardTest
{

	@Test
	public void shouldBeAMagicUser()
	{}
	
	@Test
	public void shouldBeAPerson()
	{}
	
	@Test
	public void shouldNotBeAMuggle()
	{}
	
	@Test
	public void aWizardIsMale()
	{
		Wizard harry = new Wizard("Harry Potter", 11);
		
		assertTrue(harry.gender == male);
	}
	
	@Test
	public void canBeAWitchOrWizard()
	{}
}
