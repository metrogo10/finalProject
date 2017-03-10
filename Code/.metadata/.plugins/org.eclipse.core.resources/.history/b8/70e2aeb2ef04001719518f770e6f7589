package controls;
import java.util.ArrayList;
import Characters.Enemy;
import Characters.Player;
public class Combat
{
	ArrayList<Enemy> encounter;
	Player p;
	Enemy e;
	Boolean Combat=true;
	Combat(Enemy E, Player p)
	{
		this.e=E;
		e.GenerateEncounter();
		encounter=e.getEncounter();
		this.p=p;
	}
	public void fight()
	{
		do{

		}while(Combat);
	}
	int Experiance()
	{
		int expgain=0;
		for(int i=0;i<encounter.size();i++)
		{
			int x=encounter.get(i).getLvl()-p.getLvl()+encounter.get(i).getExp();
			int y=(p.getLvl()-encounter.get(x).getLvl())*-1;
			if(y>0)
			{
				y+=1;
				x*=y;
			}
			if (y<0)
			{
				y-=1;
				x/=y;
			}
			if(x<=0)
			{
				x+=1;
			}
			expgain+=x;
		}
		return expgain;
	}
	boolean win()
	{
		boolean win = false;
		int x=0;
		for (int i=0;i<encounter.size();i++)
		{
			if (encounter.get(i).getHp()<=0)
			{
				x++;
			}
		}
		if(x==encounter.size())
		{
			win=true;
		}
		return win;
	}
}