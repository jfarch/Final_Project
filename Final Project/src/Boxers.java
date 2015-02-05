import java.util.ArrayList;
import java.util.Scanner;

public class Boxers 
	{
	static ArrayList<PickBoxer>roster = new ArrayList <PickBoxer>();
	public static void pickboxers()
	{
		
	roster.add(new PickBoxer ("1. Marshawn Lynch", 150, 70, 15, "Block", 0, "Punch", 15, "Wrap up", 5, "Beast Mode", 45));
	roster.add(new PickBoxer ("2. Gucci Mane", 180, 50, 17, "Block", 0, "Punch", 17, "Wrap up", 5, "Run the Trap", 30));
	roster.add(new PickBoxer ("3. Floyd Mayweather", 160, 100, 20, "Block", 0, "Punch", 20, "Wrap up", 5, "Jump Punch", 50));
	roster.add(new PickBoxer ("4. Manny Pacquiao", 120, 100, 30, "Block", 0, "Punch", 30, "Wrap up", 5, "Supper Punch", 90));
	roster.add(new PickBoxer ("Pac Man Jones", 70, 150, 10, "Block", 0, "Punch", 10, "Wrap up", 5, "Pistol Whip", 30));
	
	System.out.println("Hello, Welcome to the fight of your life. ");
	System.out.println("Each fighter has a certain ammount of health, stamina, and power. ");
	System.out.println("Choose your fighter wisely!");
	System.out.println("                ");
	
	int i = 0;
	for(i = 0; i < 4; i++ )
		{
		System.out.println("Do you want to be " + roster.get(i).getName());
		System.out.println("Health = " + roster.get(i).getHealth());
		System.out.println("Stamina = " + roster.get(i).getStamina());
		System.out.println("Power = " + roster.get(i).getPower());
		System.out.println("                ");
		}
	System.out.println("Press the number next to the fighters name that you want to be.");
	}
}
