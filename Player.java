import java.util.*;
import java.io.*;
public class Player
{
	private String name;
	private double qRight;
	private double qWrong;
	private boolean statusPlayed;
	
	
	public Player(String nam)
	{
		name = nam;
	}
	public void setRight(double r)
	{
		qRight = r;
	}
	public void setWrong(double w)
	{
		qWrong = w;
	}
	public void setStatusPlayed(boolean p)
	{
		statusPlayed = p;
	}
	public String getName()
	{
		return name;
	}
	public double getRight()
	{
		return qRight;
	}
	public double getWrong()
	{
		return qWrong;
	}
	public boolean getStatusPlayed()
	{
		return statusPlayed;
	}
	
}