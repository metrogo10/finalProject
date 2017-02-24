package Characters;

import java.util.ArrayList;
import java.util.Random;

public class Enemies extends Character
{
	private ArrayList<Enemies> Encounter;
	protected ArrayList GenerateEncounter()
	{
		Encounter=new ArrayList();
		Encounter.add(this);
		Random num1 = new Random();
		int num=num1.nextInt(3);
		for (int i=0; i<num; i++)
		{
			int num2=num1.nextInt(5);
			switch (num2) {
            case 1:  Encounter.add(new PebbleMonster());
                     break;
            case 2:  Encounter.add(new CaveBat());
            		 break;
            case 3:  Encounter.add(new BouncingBoulder());
            		 break;
            case 4:  Encounter.add(new CrystalGolem());
            		 break;
            default: break;
			}
		}
		return Encounter;
	}	
}