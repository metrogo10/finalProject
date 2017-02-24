package Characters;
import java.util.ArrayList;
import Items.Consumable;
import Items.Pendant;
public class Player extends Character
{
	private int lck;
	private int jmp;
	//pendant power is used to equip pendants
	private int pp;
	private ArrayList<Pendant> equipedPendants;
	private ArrayList<Consumable> ItemInventory;
	private ArrayList<Pendant> pendantInventory;
	Player(String name)
	{
		lvl=1;
		hp=10;
		gp=5;
		cp=1;
		spd=2;
		atk=1;
		def=1;
		exp=0;
		lck=1;
		jmp=1;
		Name=name;
	}
}