package Characters;
import controls.Sprite;
public class Character extends Sprite
{
	protected int posx;
	protected int posy;
	protected int hp;
	protected int lvl;
	protected int spd;
	protected int def;
	protected int atk;
	protected int exp;
	//crystal power is used for the mc's special moves from getting the crystals
	protected int cp;
	//Gem power is basically mana
	protected int gp;
	protected String Name;
	public int getHp()
	{
		return hp;
	}
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	public int getLvl()
	{
		return lvl;
	}
	public void setLvl(int lvl)
	{
		this.lvl = lvl;
	}
	public int getSpd()
	{
		return spd;
	}
	public void setSpd(int spd)
	{
		this.spd = spd;
	}
	public int getDef()
	{
		return def;
	}
	public void setDef(int def)
	{
		this.def = def;
	}
	public int getAtk()
	{
		return atk;
	}
	public void setAtk(int atk)
	{
		this.atk = atk;
	}
	public int getExp()
	{
		return exp;
	}
	public void setExp(int exp)
	{
		this.exp = exp;
	}
	public int getCp()
	{
		return cp;
	}
	public void setCp(int cp)
	{
		this.cp = cp;
	}
	public int getGp()
	{
		return gp;
	}
	public void setGp(int gp)
	{
		this.gp = gp;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public int getPosx()
	{
		return posx;
	}
	public void setPosx(int posx)
	{
		this.posx = posx;
	}
	public int getPosy()
	{
		return posy;
	}
	public void setPosy(int posy)
	{
		this.posy = posy;
	}
}