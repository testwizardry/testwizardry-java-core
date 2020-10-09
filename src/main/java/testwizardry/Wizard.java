package testwizardry;

public class Wizard extends Person implements MagicUser
{
	public Wizard(String name, int age)
	{
		super(name, Gender.male, age);
	}
	
	public boolean castSpell(Spell spell)
	{
		return false;
	}

	public boolean brewPotion(Potion potion)
	{
		return false;
	}

}
