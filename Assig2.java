import java.util.*;
import java.io.*;
public class Assig2
{
	public static void main(String [] args) throws FileNotFoundException
	{
		System.out.println("Welcome to the thunderdome bitch");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		Player player = checkPlayerStatus(name);
		if (player.getStatusPlayed())
		{
		
		}
		else
		{
			Quiz q = theQuiz();
		}
	}
	
	
	private static Player checkPlayerStatus(String name) throws FileNotFoundException
	{
		String f = "players.txt";
		File file = new File(f);
		Scanner play;
		play = new Scanner(file);
		Player player = null;
		while(play.hasNextLine())
		{
			String playerName = play.nextLine();
			if(playerName.equals(name))
			{
				double questRight = Double.parseDouble(play.nextLine());
				double questWrong = Double.parseDouble(play.nextLine());
				player = new Player(name);
				player.setRight(questRight);
				player.setWrong(questWrong);
				player.setStatusPlayed(true);
				break;
			}
			else
			{
				player = new Player(name);
				player.setStatusPlayed(false);
				break;
			}
		}
		return player;
	}
	
	
	private static Quiz theQuiz() throws IOException
	{
		Quiz Q = new Quiz("questions.txt");
	}
	
}
	
