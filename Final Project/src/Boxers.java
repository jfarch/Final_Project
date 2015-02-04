import java.util.ArrayList;
import java.util.Scanner;

public class Boxers 
	{
	static ArrayList<PickBoxer>roster = new ArrayList <PickBoxer>();
	public static void pickboxers()
	{
		
	roster.add(new PickBoxer ("1. Marshawn Lynch", 150, 70, 15));
	roster.add(new PickBoxer ("2. Gucci Mane", 180, 50, 17));
	roster.add(new PickBoxer ("3. Floyd Mayweather", 160, 100, 20));
	roster.add(new PickBoxer ("4. Floyd Mayweather", 120, 100, 30));
	
	System.out.println("Hello, Welcome to the fight of your life. ");
	System.out.println("Each fighter has a certain ammount of health, stamina, and power. ");
	System.out.println("Choose your fighter wisely!");
	System.out.println("                ");
	
	int i = 0;
	for(i = 0; i < roster.size(); i++ )
		{
		System.out.println("Do you want to be " + roster.get(i).getName() + "?");
		System.out.println("Health = " + roster.get(i).getHealth());
		System.out.println("Stamina = " + roster.get(i).getStamina());
		System.out.println("Power = " + roster.get(i).getPower());
		System.out.println("                ");
		}
	System.out.println("Press the number next to the fighters name that you want to be.");
	
	Scanner userInput = new Scanner(System.in);
	int choices = userInput.nextInt();
		if (choices == 1)
			{
			System.out.println("You choose Marshawn Lynch");
			}
		else if (choices == 2)
			{
			System.out.println("You choose Gucci Mane");
			}
		else if (choices == 3)
			{
			System.out.println("You choose Floyd Mayweather");
			}
		else if (choices == 4)
			{
			System.out.println("You choose Floyd Mayweather");
			}
	}
	}
