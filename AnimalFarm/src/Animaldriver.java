import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Animaldriver {

	public static void main(String[] args) {
//		
		File aFile = createfile();
		ArrayList<Animal> afarm = readfile(aFile);
		writefile(aFile, afarm);

//		Animal ani = new Animal("boo", 75, 275);
//		afarm.add(ani);
//		Animal pig = new Pig("black", "oink",75, 375);
//		afarm.add(pig);
//		Animal cow = new Cow("moo",75,550);
//		afarm.add(cow);

//		System.out.println(ani);
//		System.out.println(pig);
//		System.out.println(cow);
//		prettyprint(afarm);

	}

	private static ArrayList<Animal> readfile(File myfile)
	{
		ArrayList<Animal> afarm = new ArrayList<>();
		
		try {
			Scanner myReader = new Scanner(myfile);
			while(myReader.hasNextLine())
			{
				Animal ani;
				String type = myReader.nextLine();
				String sound = myReader.nextLine();
				int hight = myReader.nextInt();
				int weight = myReader.nextInt();
				if(myReader.hasNextLine()) myReader.nextLine();
				if(type.equals("pig"))
				{
					String color = myReader.nextLine();
					ani = new Pig(sound, color, hight, weight);
				}
				else if(type.equals("cow"))
				{
					ani = new Cow(sound,hight,weight);
				}
				else		
				{
					ani = new Animal(sound,hight,weight);
				}
				afarm.add(ani);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		
		return afarm;
	
	}

	private static void writefile(File file, ArrayList<Animal> animals) {
		try {
			FileWriter myWriter = new FileWriter("animal Farm.txt");
			for (Animal animal : animals) {
				myWriter.write(animal.getType() + "\n");
				myWriter.write(animal.getSound() + "\n");
				myWriter.write(animal.getHight() + "\n");
				myWriter.write(animal.getWeight() + "\n");
				if (animal.getType().equals("pig")) {
					myWriter.write(animal.getColor() + "\n");
				}

			}
			myWriter.close();
			System.out.println("successfully written to file");
		} catch (IOException e) {
			System.out.println("there was an error in writing your file");
			e.printStackTrace();
		}
	}

	private static File createfile() {
		{
			File myFile = new File("animal farm.txt");
			try {
				if (myFile.createNewFile()) {
					System.out.println("file created:" + myFile.getName());
				} else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				System.out.println("an error ocurred while creating your file");
				e.printStackTrace();
			}
			return myFile;

		}
	}

	private static void prettyprint(ArrayList<Animal> afarm) {
		for (Animal animal : afarm) {
			System.out.println(animal.getClass());
			animal.animalsound();
			if (animal instanceof Pig) {
				System.out.println("wee wee weee and wee some more");
			}
		}

	}

}
