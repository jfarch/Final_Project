import java.util.ArrayList;
import java.util.Scanner;


public class PickBoxer 
	{
	static Scanner userInput = new Scanner (System.in);
	public String name;
	public int health;
	public int stamina;
	public int power;
	
	public String move1;
	public int Block;
	public String move2;
	public int Punch;
	public String move3;
	public int Wrapup;
	public String move4;
	public int Special;
	
	
		public PickBoxer(String string, int h, int s, int p, String move1name, int bloc, String move2name, int pun, String move3name, int wrap, String move4name, int spec) 
			{
			name = string;
			health = h;
			stamina = s;
			power = p;
			
				move1 = move1name;
				Block = bloc;
				
				move2 = move2name;
				Punch = pun;
				
				move3 = move3name;
				Wrapup = wrap;
				
				move4 = move4name;
				Special = spec;
			}
			public String getMove1() {
			return move1;
		}
		public void setMove1(String move1) {
			this.move1 = move1;
		}
		public String getMove2() {
			return move2;
		}
		public void setMove2(String move2) {
			this.move2 = move2;
		}
		public String getMove3() {
			return move3;
		}
		public void setMove3(String move3) {
			this.move3 = move3;
		}
		public String getMove4() {
			return move4;
		}
		public void setMove4(String move4) {
			this.move4 = move4;
		}
		public int getSpecial() {
			return Special;
		}
		public void setSpecial(int special) {
			Special = special;
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
			public int getBlock() 
				{
				return Block;
				}
			public void setBlock(int block) 
				{
					Block = block;
				}
			public int getPunch() 
				{
					return Punch;
				}
			public void setPunch(int punch) 
				{
					Punch = punch;
				}
			public int getWrapup() 
				{
					return Wrapup;
				}
			public void setWrapup(int wrapup) 
				{
					Wrapup = wrapup;
				}
			
		}

