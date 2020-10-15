package testwizardry;

import static org.testng.AssertJUnit.*;
import static testwizardry.Gender.*;

import org.testng.annotations.Test;

public class WitchTest
{
	Person witch = new Witch("Hermione", 11);
	
	@Test
	public void aWitchIsFemale()
	{		
		assertEquals(witch.gender, female);
	}
	
	@Test
	public void aWitchIsPerson()
	{		
		assertTrue(witch instanceof Person);
	}
	
	public void aWitchIsMagicUser()
	{		
		assertTrue(witch instanceof MagicUser);
	}
	
	public void aWitchIsNotAMuggle()
	{		
		assertFalse(witch instanceof Muggle);
	}
}
