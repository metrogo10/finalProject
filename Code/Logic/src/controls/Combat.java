package controls;
import java.util.ArrayList;
import Characters.Enemies;
import Characters.Player;
public class Combat 
{
	ArrayList<Enemies> encounter;
	Player p;
	Combat(Enemies E, Player p)
	{
		E.GenerateEncounter();
		encounter=E.getEncounter();
		this.p=p;
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
			}
			if (y<0)
			{
				y-=1;
			}
			x*=y;
			if(x<=0)
			{
				x+=1;
			}
			expgain+=x;
		}
		return 0;
	}
}