package Characters;
import java.util.ArrayList;
import java.util.Random;
public class Enemies extends Character
{
	protected Random num1 = new Random();
	private ArrayList<Enemies> Encounter;
	protected ArrayList GenerateEncounter()
	{
		Enemies m1=this;
		m1.Encounter.removeAll(Encounter);
		Encounter=new ArrayList();
		Encounter.add(m1);
		int num=num1.nextInt(3);
		for (int i=0; i<num; i++)
		{
			int num2=num1.nextInt(5);
			switch (num2) {
            case 1:  Encounter.add(new PebbleMonster(0));
                     break;
            case 2:  Encounter.add(new CaveBat(0));
            		 break;
            case 3:  Encounter.add(new BouncingBoulder(0));
            		 break;
            case 4:  Encounter.add(new CrystalGolem(0));
            		 break;
            default: break;
			}
		}
		return Encounter;
	}	
}