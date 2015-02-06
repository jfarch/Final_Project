import java.util.Scanner;

public class Fighting 
	{
	static int pacmanMove;
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
		System.out.println("Power = " + Boxers.roster.get(4).getPower());
		System.out.println("His power move is " + Boxers.roster.get(4).getMove4() + " = " + "30");
		
		boolean keepPlaying = true;
		
		while (keepPlaying)
		{
		int move = userInput.nextInt();
		if (choice == 1)
			{
			switch(move)
				{
				case 1:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(0).getBlock());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 2:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(0).getPunch());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 3:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(0).getWrapup());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 4:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(0).getSpecial());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				}
			}
		
		
			if (choice == 2)
			{
			switch(move)
				{
				case 1:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(1).getBlock());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 2:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(1).getPunch());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 3:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(1).getWrapup());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 4:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(1).getSpecial());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				}
			}
			
			
			if (choice == 3)
			{
			switch(move)
				{
				case 1:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(2).getBlock());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 2:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(2).getPunch());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 3:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(2).getWrapup());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 4:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(2).getSpecial());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				}
			}
			
			
			if (choice == 4)
			{
			switch(move)
				{
				case 1:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(3).getBlock());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 2:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(3).getPunch());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 3:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(3).getWrapup());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				case 4:
					{
					Boxers.roster.get(4).setHealth(Boxers.roster.get(4).getHealth() -  Boxers.roster.get(3).getSpecial());
					System.out.println(Boxers.roster.get(4).getHealth());
					break;
					}
				}
			}
			
			
			if(choice == 1)
				{
				pacmanMove = (int)(Math.random() * 4) + 1;
				switch (pacmanMove)
					{
					case 1:
						{
						Boxers.roster.get(0).setHealth(Boxers.roster.get(0).getHealth() -  Boxers.roster.get(4).getBlock());
						System.out.println("Pacman Jones did block for 8 damage.  Your new health is " + Boxers.roster.get(0).getHealth() + "!");
						break;
						}
					case 2:
						{
						Boxers.roster.get(0).setHealth(Boxers.roster.get(0).getHealth() -  Boxers.roster.get(4).getPunch());
						System.out.println("Pacman Jones punched you in the face for 10.  Your new health is " + Boxers.roster.get(0).getHealth() + "!");
						break;
						}
					case 3:
						{
						Boxers.roster.get(0).setHealth(Boxers.roster.get(0).getHealth() -  Boxers.roster.get(4).getWrapup());
						System.out.println("Pacman Jones did wrapped you up for 5 damage.  Your new health is " + Boxers.roster.get(0).getHealth() + "!");
						break;
						}
					case 4:
						{
						Boxers.roster.get(0).setHealth(Boxers.roster.get(0).getHealth() -  Boxers.roster.get(4).getSpecial());
						System.out.println("Pacman Jones did pistol whipped you for 30 damage.  Your new health is " + Boxers.roster.get(0).getHealth() + "!");
						break;
					}
				}
			}
			if (Boxers.roster.get(0).getHealth() <= 0 || Boxers.roster.get(4).getHealth() <=0)
			{
			System.out.println("Game over!!");
			keepPlaying = false;
			break;
			}
			
			
			if(choice == 2)
				{
				pacmanMove = (int)(Math.random() * 4) + 1;
				switch (pacmanMove)
					{
					case 1:
						{
						Boxers.roster.get(1).setHealth(Boxers.roster.get(1).getHealth() -  Boxers.roster.get(4).getBlock());
						System.out.println("Pacman Jones did block for 8 damage.  Your new health is " + Boxers.roster.get(1).getHealth() + "!");
						break;
						}
					case 2:
						{
						Boxers.roster.get(1).setHealth(Boxers.roster.get(1).getHealth() -  Boxers.roster.get(4).getPunch());
						System.out.println("Pacman Jones punched you in the face for 10.  Your new health is " + Boxers.roster.get(1).getHealth() + "!");
						break;
						}
					case 3:
						{
						Boxers.roster.get(1).setHealth(Boxers.roster.get(1).getHealth() -  Boxers.roster.get(4).getWrapup());
						System.out.println("Pacman Jones did wrapped you up for 5 damage.  Your new health is " + Boxers.roster.get(1).getHealth() + "!");
						break;
						}
					case 4:
						{
						Boxers.roster.get(1).setHealth(Boxers.roster.get(1).getHealth() -  Boxers.roster.get(4).getSpecial());
						System.out.println("Pacman Jones did pistol whipped you for 30 damage.  Your new health is " + Boxers.roster.get(1).getHealth() + "!");
						break;
					}
				}
			}
			if (Boxers.roster.get(1).getHealth() <= 0 || Boxers.roster.get(4).getHealth() <=0)
			{
			System.out.println("Game over!!");
			keepPlaying = false;
			break;
			}
			
			
			if(choice == 3)
			{
			pacmanMove = (int)(Math.random() * 4) + 1;
			switch (pacmanMove)
				{
				case 1:
					{
					Boxers.roster.get(2).setHealth(Boxers.roster.get(2).getHealth() -  Boxers.roster.get(4).getBlock());
					System.out.println("Pacman Jones did block for 8 damage.  Your new health is " + Boxers.roster.get(2).getHealth() + "!");
					break;
					}
				case 2:
					{
					Boxers.roster.get(2).setHealth(Boxers.roster.get(2).getHealth() -  Boxers.roster.get(4).getPunch());
					System.out.println("Pacman Jones punched you in the face for 10.  Your new health is " + Boxers.roster.get(2).getHealth() + "!");
					break;
					}
				case 3:
					{
					Boxers.roster.get(2).setHealth(Boxers.roster.get(2).getHealth() -  Boxers.roster.get(4).getWrapup());
					System.out.println("Pacman Jones did wrapped you up for 5 damage.  Your new health is " + Boxers.roster.get(2).getHealth() + "!");
					break;
					}
				case 4:
					{
					Boxers.roster.get(2).setHealth(Boxers.roster.get(2).getHealth() -  Boxers.roster.get(4).getSpecial());
					System.out.println("Pacman Jones did pistol whipped you for 30 damage.  Your new health is " + Boxers.roster.get(2).getHealth() + "!");
					break;
					}	
				}
			}
			if (Boxers.roster.get(2).getHealth() <= 0 || Boxers.roster.get(4).getHealth() <=0)
			{
			System.out.println("Game over!!");
			keepPlaying = false;
			break;
			}
			
			
			if(choice == 4)
			{
			pacmanMove = (int)(Math.random() * 4) + 1;
			switch (pacmanMove)
				{
				case 1:
					{
					Boxers.roster.get(3).setHealth(Boxers.roster.get(3).getHealth() -  Boxers.roster.get(4).getBlock());
					System.out.println("Pacman Jones did block for 8 damage.  Your new health is " + Boxers.roster.get(3).getHealth() + "!");
					break;
					}
				case 2:
					{
					Boxers.roster.get(3).setHealth(Boxers.roster.get(3).getHealth() -  Boxers.roster.get(4).getPunch());
					System.out.println("Pacman Jones punched you in the face for 10.  Your new health is " + Boxers.roster.get(3).getHealth() + "!");
					break;
					}
				case 3:
					{
					Boxers.roster.get(3).setHealth(Boxers.roster.get(3).getHealth() -  Boxers.roster.get(4).getWrapup());
					System.out.println("Pacman Jones did wrapped you up for 5 damage.  Your new health is " + Boxers.roster.get(3).getHealth() + "!");
					break;
					}
				case 4:
					{
					Boxers.roster.get(3).setHealth(Boxers.roster.get(3).getHealth() -  Boxers.roster.get(4).getSpecial());
					System.out.println("Pacman Jones did pistol whipped you for 30 damage.  Your new health is " + Boxers.roster.get(3).getHealth() + "!");
					break;
					}
				}
			if (Boxers.roster.get(3).getHealth() <= 0 || Boxers.roster.get(4).getHealth() <=0)
				{
				System.out.println("Game over!!");
				keepPlaying = false;
				break;
				}
			}
		}
	}
}


	
