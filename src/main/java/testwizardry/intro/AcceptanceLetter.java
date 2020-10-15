package testwizardry.intro;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

import testwizardry.Person;

public class AcceptanceLetter
{
	Wizard wizard;
	String letter;
	
	public AcceptanceLetter(Wizard player)
	{
		this.wizard = player;
		load("HogwartsAcceptanceLetter.txt");
	}
	
	public void print()
	{
		System.out.print(letter.replace("{Surname}", wizard.lastName));
	}
	
	private void load(String filename)
	{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream(filename);
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		
		letter = reader.lines().collect(Collectors.joining("\n"));
	}
	
}
