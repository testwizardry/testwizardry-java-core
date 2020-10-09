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
}
