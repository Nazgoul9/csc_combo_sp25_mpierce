
public class Cow extends Animal{
	private String type;
	public Cow() {
		super("moo", 0, 0 );
	}

	public Cow(String sound, int hight, int weight) {
		super(sound, hight, weight);
		this.type = "cow";
	}
	
	@Override
	public void animalsound() {
		System.out.println("the cow goes moo!?!");
	}
	@Override
	public String getType()
	{
		return this.type;
	}

	@Override
	public String toString() {
		return "Cow" + super.toString();
	}
	

}
