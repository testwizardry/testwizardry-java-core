package testwizardry;

import org.testng.Assert;
import org.testng.annotations.Test;
import static testwizardry.Gender.*;

public class PersonTest
{
	Person harry = new Person("Harry Potter", male, 11);
	Person hermione = new Person("Hermione Granger", female, 11);
	
	@Test
	public void shouldHaveName()
	{
		Assert.assertEquals(harry.name, "Harry Potter");
		Assert.assertEquals(hermione.name, "Hermione Granger");
	}

	@Test
	public void shouldGiveFirstName()
	{
		Assert.assertEquals(harry.getFirstName(), "Harry");
		Assert.assertEquals(hermione.getFirstName(), "Hermione");
	}
	
	public void shouldGiveLastName()
	{
		// todo implement (Lesson 8)
	}
}
