package lessons.lesson6;

import testwizardry.Gender;
import testwizardry.Person;

public class Lesson6Scratchpad
{
	public static void main(String[] args)
	{
		Person a = new Person("Harry Potter", Gender.male, 11);
		Person a2 = a;
		Person b = new Person("Harry Potter", Gender.male, 11);
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(b);
		
		if (a == a2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		
		if (a.equals(a2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
	}
}
