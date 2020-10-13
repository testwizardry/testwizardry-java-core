package testwizardry.intro;

import java.util.Scanner;

public class TestWizardryConsole
{
	static final String school = "Hogwarts";
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== TEST WIZARDRY ===");
		System.out.println("Welcome to TestWizardry!");
		
		print("What is your name?");
		String firstName = input.nextLine();
		
		print("What is your last name?");
		String lastName = input.nextLine();
		
		print("Hello, " + firstName);
		print("Tell me a bit about yourself");
		
		print("Are you male or female?");
		Gender gender = Gender.valueOf(input.nextLine().toLowerCase().strip());
		
		if (gender.equals(Gender.male))
		{
			print("You're a wizard!");
		}
		else if (gender.equals(Gender.female))
		{
			print("You're a witch!");
		}
		
		else
		{
			print("I'm sorry, I didn't understand");
			System.exit(0);
		}
		
		print("How old are you?");
		
		int age = input.nextInt();
		
		if (age < 11)
		{
			print("That's not old enough for Wizardry school");
		}
		if (age > 11)
		{
			print("That's too old to start Wizardry school");
		}
		if (age != 11)
		{
			print("How old are you really? (Hint: say 11)");
			age = input.nextInt();
		}
		
		if (age == 11)
		{
			print("Well, happy birthday!");
			print("And congratulations, you've just been accepted to the " 
			+ school + " school of witchcraft & wizardry!");
		}
		else 
		{
			print("Thanks for playing, but I'm afraid you're not eligible for " + school);
			System.exit(0);
		}
		
		Wizard wizard = new Wizard(firstName, lastName, gender, age);
		new AcceptanceLetter(wizard).print();
		
		print("But there's no time to celebrate, you need to reply via owl post and get your supplies");
		print("It's off to Diagon Alley with you");
		
		input.close();
	}
	
	public static void print(String message)
	{
		System.out.println(message);
	}
}
