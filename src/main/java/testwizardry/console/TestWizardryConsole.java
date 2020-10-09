package testwizardry.console;

import java.util.Scanner;

import testwizardry.Gender;
import testwizardry.MagicUser;
import testwizardry.Witch;
import testwizardry.Wizard;

public class TestWizardryConsole
{
	static Scanner input;
	static MagicUser player;
	
	public static void main(String[] args) throws Exception
	{
		input = new Scanner(System.in);
		
		System.out.println("Welcome to Test Wizardry!");
		
		String name = askName();
		Gender gender = askGender();
		int age = askAge();
		
		player = createPlayer(name, gender, age);
		
		System.out.println(player);
		
		input.close();
	}
	
	private static MagicUser createPlayer(String name, Gender gender, int age) throws Exception
	{
		MagicUser player;
		
		if (gender.equals(Gender.female))
		{
			player = new Witch(name, age);
		}
		else if (gender.equals(Gender.male))
		{
			player = new Wizard(name, age);
		}
		else
		{
			throw new Exception("No gender specified");
		}
		
		return player;
		
	}

	public static String askName()
	{
		print("What is your name?");
		String name = input.nextLine();
		print("Hello, " + name + "!");
		return name;
	}
	
	public static Gender askGender()
	{
		print("Are you male or female?");
		Gender gender = Gender.valueOf(Gender.class, input.nextLine().toLowerCase());
		
		if (gender == Gender.male)
		{
			print("You're a wizard!");
		}
		else if (gender == Gender.female)
		{
			print("You're a witch!");
		}
		
		return gender;
	}
	
	public static int askAge()
	{
		print("How old are you?");
		int age = Integer.valueOf(input.nextLine());
		
		if (age > 11)
		{
			print("That's too old to apply to Hogwarts");
		}
		if (age < 11)
		{
			print("That's too young to apply to Hogwarts");
		}
		
		if (age != 11) 
		{
			print("Are you sure that's you're real age?");
			print("How old are you really? (Hint: say 11)");
			age = Integer.valueOf(input.nextLine());
		}
		
		return age;
	}
	public static void print(String message)
	{
		System.out.println(message);
	}
}
