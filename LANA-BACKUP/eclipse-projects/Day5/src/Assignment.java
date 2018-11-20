
import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

public class Assignment 
{
	public static void main(String[] args) 
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String Name = sc.nextLine();
		
		System.out.println(Name);
	for(int i=0;i<Name.length();i++)
		{
			char c = Name.charAt(i);
			map.put(c,0);
			System.out.println(c);
			
			
			
			if (map.containsKey(c)) 
			
			{
			    int cnt = map.get(c);
			    map.put(c, ++cnt);
			  }
			
			else
			  {
			    map.put(c, 1);
			  }
			System.out.println(map.get(i));
			}
			
		}

		//System.out.println(Name.length());
		
	}



