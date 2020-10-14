package testwizardry;

import static org.testng.AssertJUnit.*;
import static testwizardry.Gender.*;

import org.testng.annotations.Test;

public class WitchTest
{

	@Test
	public void aWitchIsFemale()
	{
		Person hermione = new Witch("Hermione", 11);
		
		assertEquals(hermione.gender, female);
	}
}
