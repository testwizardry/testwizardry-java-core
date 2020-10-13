package testwizardry.intro;

public class Wizard extends Person
{
	public Wizard(String firstName, String lastName, Gender gender, int age)
	{
		super(firstName, lastName, gender, age);
	}
	
	public void brewPotion()
	{
		//TODO: implement brewPotion()
		throw new RuntimeException("not implemented");
	}
	
	public boolean castSpell(Spell spell)
	{
		//TODO: implement castSpell()
		throw new RuntimeException("not implemented");
	}
}
