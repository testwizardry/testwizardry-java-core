package testwizardry;

import static org.testng.Assert.*;
import static testwizardry.Gender.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HogwartsAcceptanceDataDrivenTest
{
	static final Boolean admit = true;
	static final Boolean reject = false;
	
	Person harry = new Wizard("Harry Potter", 11);
	Person dudley = new Muggle("Dudley Dursley", male, 11);
	Person hermione = new Witch("Hermione Granger", 11);
	Person aaron = new Person("Aaron Evans", male, 45);
	Person albus = new Wizard("Albus Dumbledore", 99);
	Person jenny = new Wizard("Jenny Weasley", 10);
	
	School hogwarts = new Hogwarts();
	
	@Test(dataProvider="people")
	public void testAdmittance(Person person, boolean expectAdmittance)
	{
		assertEquals(hogwarts.admit(person), expectAdmittance);
	}
	
	@DataProvider(name = "people")
	public Object[][] people()
	{
		return new Object[][] {
			{ new Wizard("Harry Potter", 11), admit },
			{ new Witch("Hermione Granger", 11), admit },
			{ new Witch("Jenny Weasley", 10), reject },
			{ new Wizard("Albus Dumbledore", 99), reject },
			{ new Muggle("Dudley Dursley", male, 11), reject },
			{ new Person("Aaron Evans", male, 12), reject }
		};
	}
}
