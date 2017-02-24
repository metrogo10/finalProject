package Gear;
import Characters.Player;
public class AttackJewl extends Pendant
{
	AttackJewl()
	{
		bonus=2;
		Description="Boosts Attack power by 2.";
	}
	public void check(Player p)
	{
		if(isEquiped())
		{
			p.setAtk(p.getAtk()+bonus);
		}
	}
}