package testwizardry;

public class Hogwarts implements School
{
	String name = "Hogwarts";
	
	public String getName()
	{
		return name;
	}
	
	public boolean admit(Person person)
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

	public boolean expel(Person person)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
