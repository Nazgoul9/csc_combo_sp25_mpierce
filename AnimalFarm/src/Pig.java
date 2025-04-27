
public class Pig extends Animal{
	private String color;
	private String type;

	public Pig( String color, String sound, int hight, int weight) {
		super("oink", 70, 600);
		this.color = color;
		this.type = "pig";
	}
	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String getType()
	{
		return this.type;
	}
	
	@Override
	public void animalsound() {
		System.out.println("the pig goes wee wee wee ");
	}

	@Override
	public String toString() {
		return "Pig color=" + color + super.toString();
	}
	
	
	
	

}
