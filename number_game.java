import java.util.*;
//import java.random;
public class number_game
{
	static void array_printer(int arr[], int size)
	{
		System.out.print("\nYour Guesses : ");
		System.out.print(arr[0]);
		for (int index = 1; index <= size; index++)
		{
			System.out.print(" -> " + arr[index]);
		}
		System.out.println();
	}

	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		
		System.out.println("Hello World");

		//int num = r.nextInt(100) + 1;
		//System.out.println(num);

		System.out.println("Guess the number between 1 - 100 !!!!");
		//System.out.println();


		int size = 15, input = 67, exit = 0;

		while (input != 0)
		{

			System.out.println("\nSelect Range : ");
			System.out.println();
			System.out.println("(1)    Default Range    (1 to 100)");
			System.out.println("(2)    Custom Range     (Create your own custom range) \n");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			while (choice < 1 || choice > 2)
			{
				System.out.println("Invalid Input, input should be between 1 or 2, Try Again (1) or Exit (0) !!");
				System.out.print("Enter input : ");
				input = sc.nextInt();
				//exit = sc.nextInt();
				sc.nextLine();
				if (input == 0)
				{
					break;
				}
				else if (input == 1)
				{
					System.out.println("\nSelect Range : ");
					System.out.println();
					System.out.println("(1)    Default Range    (Guess between 1 to 100)");
					System.out.println("(2)    Custom Range     (Create your own custom range) \n");
					System.out.print("Enter your choice : ");
					choice = sc.nextInt();
					sc.nextLine();
				}
			}
			if (input == 0)
			{
				break;
			}

			int u_limit = 100, l_limit = 1;
			if (choice == 2)
			{
				System.out.print("Enter lower limit : ");
				l_limit = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter upper limit : ");
				u_limit = sc.nextInt();
				sc.nextLine();

				if (u_limit < l_limit)
				{
					u_limit+=l_limit;
					l_limit = u_limit - l_limit;
					u_limit-=l_limit;
				}
			}

		System.out.println("\nSelect Difficulty : ");
		System.out.println();
		System.out.println("(1)    Easy    (10 Chances) ");
		System.out.println("(2)    Medium  (5 Chances)");
		System.out.println("(3)    Hard    (3 Chances)");
		System.out.println("(4)    Custom  (Choose number of chances)");
		System.out.println("(5)    Random       ????? ");
		System.out.println();
		System.out.print("Enter difficulty : ");
		input = sc.nextInt();
		sc.nextLine();

		while (input < 1 || input > 5)
		{
			

			System.out.println("Invalid Input, input should be between 1 to 5, Try Again (1) or Exit (0) !!");
			System.out.print("Enter input : ");
			input = sc.nextInt();
			//exit = sc.nextInt();
			sc.nextLine();
			if (input == 0)
			{
				break;
			}
			else if (input == 1)
			{
				System.out.println("\nSelect Difficulty : ");
				System.out.println();
				System.out.println("(1)    Easy    (10 Chances) ");
				System.out.println("(2)    Medium  (5 Chances)");
				System.out.println("(3)    Hard    (3 Chances)");
				System.out.println("(4)    Custom  (Choose number of chances)");
				System.out.println("(5)    Random       ????? ");
				System.out.println();
				System.out.print("Enter difficulty : ");
				input = sc.nextInt();
				sc.nextLine();
			}
		}

		if (input == 1)
		{
			size = 10;
		}
		else if (input == 2)
		{
			size = 5;
		}
		else if (input == 3)
		{
			size = 3;
		}
		else if (input == 4)
		{
			System.out.print("Enter the number of chances : ");
			size = sc.nextInt();
			sc.nextLine();
		}
		else if (input == 5)
		{
			// To choose random options and not within a range, an array is to be created, the product design is to be further planned
			int options[] = {10, 5, 3};
			size = options[r.nextInt(3)];

			System.out.print("\nDifficulty :");
			if (size == 10)
			{
				System.out.println(" Easy");
			}
			else if (size == 5)
			{
				System.out.println(" Medium");
			}
			else
			{
				System.out.println(" Hard");
			}
		}
		else if (input == 0)
		{
			break;
		}
		else
		{
			/*System.out.println("Invalid Input, Try again (1) or Exit (0) : ");
			System.out.print("Enter input : ");
			input = sc.nextInt();
			//exit = sc.nextInt();
			sc.nextLine();
			if (input == 0)
			{
				break;
			}*/
		}
		int rounds = 1, jindex = 0;
		boolean won = false;

		System.out.print("Enter the number of rounds : ");
		rounds = sc.nextInt();
		sc.nextLine();
		System.out.print("\n\n" + rounds);
		if (rounds == 1)
		{
			System.out.println(" round");
		}
		else
		{
			System.out.println(" rounds");
		}
		
		int total_score = 0;
		for (int index = 1; rounds >= index; index++)
		{
			System.out.println("\nRound " + index);
			int chances = size, guess, guesses[] = new int [size];
			double score = 100;
			jindex = 0;

			int num;
			if (choice == 2)
			{
				//num = r.nextInt(u_limit - l_limit + 1) + l_limit;
			}
			else
			{
				//num = r.nextInt(100) + 1;
				num = 50;
			}

		for (jindex = 0; chances > jindex; jindex++)
		{
			
			if (jindex == 0)
			{
				System.out.println("You got " + (size - jindex) + " chances");
				//chances--;
			}
			else
			{
				if ((size - jindex) != 1)
				{
					System.out.println((size - jindex) + " chances left");
				}
				else
				{
					System.out.println((size - jindex) + " chance left");
				}
			}

			System.out.println();
			System.out.print("Enter your guess : ");
			guess = sc.nextInt();
			sc.nextLine();
			if ((guess >= l_limit) && (guess <= u_limit))
			{
			System.out.println();
			guesses[jindex] = guess;

			if (guess > num)
			{
				System.out.println("GO lesser");
				score-=10;
			}
			else if (guess < num)
			{
				System.out.println("GO greater");
				score-=10;
			}
			else
			{
				System.out.println("YOU WON !!");
				System.out.println();
				System.out.println("Number was " + num);
				System.out.println("Your last guess : " + guess);
				//score-=10;
				if ((input == 4) && (size > 10))
				{
					double size_doub = size;
					score = score * (10.0 / size_doub);
					//score = score/(input * 10) * 100;
				}
				System.out.println("Score : " + score);
				System.out.println((size - jindex - 1) + " chances remained");
				won = true;
				//guesses[size - chances] = guess;
				array_printer(guesses, jindex);
				break;
			}
			//chances--;
			}
			else
			{
				System.out.println("Invalid Input, Your number should be between " + l_limit + " to " + u_limit + " (both included), please try again.");
				score-=10;
			}
			
			
			
			
		}

		if (won == false)
		{
			System.out.println();
			System.out.println("You Lost");
			System.out.println("The number was " + num);
			score = 0;
			System.out.println("Score : " + score);
			array_printer(guesses, (jindex - 1));
		}
		total_score += score;
		//rounds--;
		guesses = null;
		}
		
		System.out.println("\nTotal Score : " + total_score + "/" + (rounds * 100));
		System.out.print("\nWanna Continue (1) or Exit (0) ? : ");
		input = sc.nextInt();
		sc.nextLine();
		while (input != 1 && input != 0)
		{
			System.out.print("Invalid Input, Game Continue (1) or Exit (0) : ");
			input = sc.nextInt();
			sc.nextLine();	
		}

		
		}
		System.out.println("\nSuccessfully Exited");
	}
}