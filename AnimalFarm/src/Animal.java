
public class Animal {
	private String sound;
	private int hight;
	private int weight;
	private String type;
	public Animal(String sound, int hight, int weight) {
		super();
		this.sound = sound;
		this.hight = hight;
		this.weight = weight;
		this.type = "animal";
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Animal() {
		this.sound = "blearg";
		this.hight = 0;
		this.weight = 0;
	}

	public String getType()
	{
		return this.type;
	}
	
	public String getColor()
	{
		return null;
	}
	
	public void animalsound() {
		System.out.println("the animal makes a sound.");
	}
	
	@Override
	public String toString() {
		return "Animal [sound=" + sound + ", hight=" + hight + ", weight=" + weight + "]";
	}
	
	

}
