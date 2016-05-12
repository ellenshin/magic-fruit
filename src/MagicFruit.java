import java.util.Scanner;
import java.util.ArrayList;

public class MagicFruit
{
	static int people;
	static int plants;
	static int week;
	static int fruits;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people?");
		people = sc.nextInt();
		
		System.out.println("How many fruits?");
		plants = sc.nextInt();
		
		week = 1;
		fruits = 0;
		
		for(int i = 0; i<plants; i++)
		{
			list.add(i,0);
		}
		while(checkIfEnoughFruits(people, fruits) == false)
		{
			harvest();
			grow();
			updateFruitCount();
			week++;
			for(int x: list)
			{
				System.out.print(x);
			}
			System.out.println();
		}		
		System.out.println(week);
	}
	
	public static boolean checkIfEnoughFruits(int a, int b)
	{
		if(a <= b)
			return true;
		else
			return false;
	}
	
	public static void grow()
	{	
		for(int i = 0; i<plants; i++)
		{
			list.set(i, list.get(i)+1);
		}
	}
	
	public static void harvest()
	{
		for(int i = plants; i<plants+fruits; i++)
		{
			list.add(i, 0);
		}
		plants += fruits;
	}
	
	public static void updateFruitCount()
	{
		int sum = 0;
		for(int i = 0; i<plants; i++)
		{
			sum += list.get(i);
		}
		fruits = sum;
	}
}
