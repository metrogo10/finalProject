package Gear;

import Characters.Player;

public class DefenseJewl extends Pendant
{
	DefenseJewl()
	{
		bonus=2;
		Description="Boosts Defense by 2.";
	}
	public void check(Player p)
	{
		if(isEquiped())
		{
			p.setDef(p.getDef()+bonus);
		}
	}
}