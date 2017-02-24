package Characters;
public class PebbleMonster extends Enemies
{
	PebbleMonster(int num3)
	{
		if (num3>0)
		{
			lvl=num3;
		}
		else
		{
			lvl=num1.nextInt(7)+1;
		}
		hp=num1.nextInt(3)+1+lvl;
		cp=0;
		gp=0;
		spd=num1.nextInt(3);
		def=num1.nextInt(2);
		atk=num1.nextInt(2)+1;
		exp=num1.nextInt(5)+1+lvl;
		int num2=num1.nextInt(3)+1;
		switch (num2)
		{
		case 1: spd+=lvl;
				break;
		case 2: def+=lvl;
				break;
		case 3: atk+=lvl;
				break;
		}
		int num=num1.nextInt(5)+1;
		switch (num)
		{
		case 1: Name="lilrock";
				break;
		case 2: Name="kidboulder";
				break;
		case 3: Name="pebbletta";
				break;
		case 4: Name="Rockly Jr.";
				break;
		case 5: Name="stoneson the great";
				break;
		}
	}
}