package testwizardry.intro;

public class Person
{
	public String firstName;
	public String lastName;
	public Gender gender;
	public int age;
	
	public Person(String firstName, String lastName, Gender gender, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String fullName()
	{
		return firstName + " " + lastName;
	}
}
