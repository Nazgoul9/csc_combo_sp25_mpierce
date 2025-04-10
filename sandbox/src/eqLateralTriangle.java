

import java.util.Scanner;

public class eqLateralTriangle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newtri = "y";
		while(newtri.charAt(0)=='y') 
		{
			int row=0;
			boolean rowcheck = true;
			System.out.println("how many rows do you want");
			while(rowcheck) 
			{
				row=input.nextInt();
				if(row<1||row>50) 
				{
					System.out.println("please enter a number between 1 and 50");
				}
				else rowcheck = false;
			}
			System.out.println("please enter a character to fill the triangle");
			String charstart = input.next();
			char charfinal = charstart.charAt(0);
			for(int i = 0; i<=row;i++)
			{
				for(int h = row; h>=i;h--)System.out.print("  ");
				for(int j =0;j<i;j++)System.out.print(" "+charfinal+"  ");
				System.out.println();
			}
			System.out.println("do you want another tiangle");
			newtri = input.next();
			newtri = newtri.toLowerCase();
		}
		input.close();
		
	}

}


