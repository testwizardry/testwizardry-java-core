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
				+ " is a " + age + " year old " 
				+ uncapitalize(this.getClass().getSimpleName());
	}
	
	public String getFirstName()
	{
		// everything up to the first space
		return name.substring(0, name.indexOf(' '));
	}
	
	public String getLastName()
	{
		// everything after the last space
		return name.substring(name.lastIndexOf(' '));
	}
	
	public String capitalize(String s)
	{
		// first letter uppercase, all others lowercase
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
	}
	
	public String uncapitalize(String s)
	{
		// all letters lowercase
		return s.toLowerCase();
	}
}
