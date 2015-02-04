import java.util.ArrayList;
import java.util.Scanner;


public class PickBoxer 
	{
	static Scanner userInput = new Scanner (System.in);
	static int choice;
	public String name;
	public int health;
	public int stamina;
	public int power;
			public PickBoxer(String string, int h, int s, int p) 
			{
			name = string;
			health = h;
			stamina = s;
			power = p;
			}
			String getName() 
				{
				return name;
				}
			private void setName(String name) 
				{
				this.name = name;
				}
			int getHealth() 
				{
				return health;
				}
			private void setHealth(int health) 
				{
				this.health = health;
				}
			int getStamina() 
				{
				return stamina;
				}
			private void setStamina(int stamina) 
				{
				this.stamina = stamina;
				}
			int getPower() 
				{
				return power;
				}
			private void setPower(int power) 
				{
				this.power = power;
				}
		}

