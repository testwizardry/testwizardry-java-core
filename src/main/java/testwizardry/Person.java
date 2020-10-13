package testwizardry;

public class Person
{
	public String name;
	protected Gender gender;
	protected int age;
	
	public Person(String name, Gender gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return capitalize(getFirstName()) 
				+ " is " + a_or_an(age) + " " + age + " year old " 
				+ uncapitalize(this.getClass().getSimpleName());
	}
	
	public String getFirstName()
	{
		// everything up to the first space
		int firstNameEndIndex = name.indexOf(' ');
		
		if (firstNameEndIndex != -1)
		{
			return name.substring(0, name.indexOf(' '));
		}
		else 
		{
			return name;
		}
	}
	
	public String getLastName()
	{
		// everything after the last space
		int lastNameIndex = name.lastIndexOf(' ');
		
		if (lastNameIndex != -1)
		{
			return name.substring(lastNameIndex);
		}
		else
		{
			return null;
		}
	}
	
	public String capitalize(String s)
	{
		// first letter uppercase, all others lowercase
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	public String a_or_an(String s)
	{
		String vowels = "aeiou";
		
		if (vowels.contains(s.substring(0)))
		{
			return "an";
		}
				
		return "a";
	}
	
	public String a_or_an(int n)
	{
		String nString = String.valueOf(n);
		char firstDigit = nString.charAt(0);
		
		
		if (firstDigit == '8')
		{
			return "an";
		}
		
		if (nString.equals("11"))
		{
			return "an";
		}
		
		return "a";
	}
	
	public String uncapitalize(String s)
	{
		// all letters lowercase
		return s.toLowerCase();
	}
	
	public boolean equals(Person other)
	{
		if (this.name.equals(other.name) && 
				this.gender.equals(other.gender) &&
				this.age == other.age)
		{
			return true;
		}
		
		return false;
	}
}
