package controls;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Characters.Enemy;
import Characters.Player;
public class gameEngine
{
	//exp gain = (enmy.lvl-plr.lvl+enmy.exp)+1 if plr.lvl<enmy.lvl exp*2;
	//if plr.lvl>enmy.lvl exp/2 if expgain<0,expgain=1 exp*numofenemies
	//dmg = attackers' atk- defenders'  def
	// first to go is either the one that got first strike or the team with the highest average spd.
	private BufferedReader Userinput1 = new BufferedReader (new InputStreamReader(System.in));
	private Player p;
	public gameEngine()
	{
		//String x=prompt();
		Enemy e= new Enemy();
		p= new Player("Jack");
		System.out.println(p.getName());
//		if(p.intersects(e));
//		{
//			Combat C= new Combat(e, p);
//		}
	}
	private String prompt()
	{
		boolean runLoop=false;
		System.out.println("Welcome to Crystal Caverns. please give a name for your hero.");
		String bob = null;
		do{
		try
		{
			 bob = Userinput1.readLine();
			if (bob==null||bob.isEmpty())
			{
				System.out.println("Sorry I couldn't hear that.");
				runLoop=true;
			}
			else
			{
				runLoop=false;
			}
		}
			catch (IOException e)
			{
				runLoop=true;
			}
			catch (NumberFormatException e)
			{
				runLoop=true;
			}
		}while (runLoop);
		return bob;
	}
	public Player getP()
	{
		return p;
	}
	public void setP(Player p)
	{
		this.p = p;
	}
	}