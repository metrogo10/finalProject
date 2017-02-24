package Characters;
public class CaveBat extends Enemies
{
	CaveBat(int num3)
	{
		if (num3>0)
		{
			lvl=num3;
		}
		else
		{
			lvl=num1.nextInt(7)+1;
		}
		lvl=num1.nextInt(5)+1;
		hp=num1.nextInt(3)+1+lvl;
		cp=0;
		gp=0;
		spd=num1.nextInt(3)+1;
		def=num1.nextInt(2)+1;
		atk=num1.nextInt(3)+1;
		exp=num1.nextInt(7)+1+lvl;
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
		//Add names later 5 of them
	}
}