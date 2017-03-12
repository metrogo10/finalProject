package Items;
import Characters.Character;
import controls.Sprite;
public class Consumable extends Sprite
{
	protected int hp;
	protected String Description;
	public int Use(Character c)
	{
		return c.getHp()+hp;
	}
	@Override
	public String toString()
	{
		return Description;
	}
}