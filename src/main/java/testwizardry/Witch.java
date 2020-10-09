package testwizardry;

public class Witch extends Person implements MagicUser
{
	public Witch(String name, int age)
	{
		super(name, Gender.female, age);
	}
	
	public boolean castSpell(Spell spell)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean brewPotion(Potion potion)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString()
	{
		return name + " is a " + age + " year old " + this.getClass().getSimpleName();
	}

}
