package testwizardry.intro;

import java.util.Arrays;
import java.util.List;

public enum Gender
{
	male, female;
	
	public boolean contains(String value)
	{
		for (Gender gender : Gender.values())
		{
			if (gender.name().equalsIgnoreCase(value))
			{
				return true;
			}
		}
		
		return false;
	}
}
