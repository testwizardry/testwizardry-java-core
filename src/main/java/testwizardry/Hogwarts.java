package testwizardry;

public class Hogwarts implements School
{
	public boolean accept(Person person)
	{
		if (person.age != 11)
		{
			return false;
		}
		
		if (! (person instanceof MagicUser))
		{
			return false;
		}
		
		return true;
	}

}
