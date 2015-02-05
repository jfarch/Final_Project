import java.util.Scanner;

public class Fighting 
	{
	public static void fight()
		{
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		if (choice == 1)
			{
			System.out.println("You choose Marshawn Lynch");
			System.out.println("Press the number next to the move you want to do.");
			System.out.println("1." + Boxers.roster.get(0).getMove1() );
			System.out.println("2." + Boxers.roster.get(0).getMove2() );
			System.out.println("3." + Boxers.roster.get(0).getMove3() );
			System.out.println("4." + Boxers.roster.get(0).getMove4() );
			}
		else if (choice == 2)
			{
			System.out.println("You choose Gucci Mane");
			System.out.println("Press the number next to the move you want to do.");
			System.out.println("1." + Boxers.roster.get(1).getMove1() );
			System.out.println("2." + Boxers.roster.get(1).getMove2() );
			System.out.println("3." + Boxers.roster.get(1).getMove3() );
			System.out.println("4." + Boxers.roster.get(1).getMove4() );
			}
		else if (choice == 3)
			{
			System.out.println("You choose Floyd Mayweather");
			System.out.println("Press the number next to the move you want to do.");
			System.out.println("1." + Boxers.roster.get(2).getMove1() );
			System.out.println("2." + Boxers.roster.get(2).getMove2() );
			System.out.println("3." + Boxers.roster.get(2).getMove3() );
			System.out.println("4." + Boxers.roster.get(2).getMove4() );
			}
		else if (choice == 4)
			{
			System.out.println("You choose Manny Pacquiao");
			System.out.println("Press the number next to the move you want to do.");
			System.out.println("1." + Boxers.roster.get(3).getMove1() );
			System.out.println("2." + Boxers.roster.get(3).getMove2() );
			System.out.println("3." + Boxers.roster.get(3).getMove3() );
			System.out.println("4." + Boxers.roster.get(3).getMove4() );
			}
		System.out.println("          ");
		System.out.println("You will be fighting " + Boxers.roster.get(4).getName());
		System.out.println("Health = " + Boxers.roster.get(4).getHealth());
		System.out.println("Stamina = " + Boxers.roster.get(4).getStamina());
		System.out.println("Power = " + Boxers.roster.get(4).getPower());
		}
	}
	
