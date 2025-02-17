/**
 * this is what we learned in class about loops
 * im too lazy to type what bob typed so this 
 * is what im doing
 * 
 * @author morga
 * @date 2/17/25
 * 
 * 
 */

package sandbox;

import java.util.Scanner;

public class loopsies {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		//first we do while loops
		int x= 45;//declaration/initializer
		
		while (x>=0)//condition setter
		{//this is the body
			 System.out.println(x);
			 x--;//the changer(i prefer escapement cause it sounds cooler) also technically a decrimentor but thats a booring word
			 
			 
		}//end body
		//this is after loop
		System.out.println("blast off");
		
		
		//loops with extra shit
		int i = 10;//initializer
				
		while (i!=100)//condition
		{
			
			//changer in here
			System.out.println(i);
			if (i%2==0)//mod first then check
			{
				i = i/2;//first devide then set value
			}else {
				i=3*i+1;//follow pemdas dumass typing comments for arithmatic is fucking anoying
			}
		}
		String another = "yes";
		int people;
		while (another.charAt(0)=='y') {
			people ++;
			
			System.out.println("are there more people");
			another = input.next();
			System.out.println(people);
		}
		//now for loops
		int a=0;
				
		for(a = 10; a > 0; a--)//condition, escapement initializer and 
		{//this is the body
			System.out.println(a);
		}
		System.out.println("blast on");
		int j = ++i;//a pre incrimentor
			
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
