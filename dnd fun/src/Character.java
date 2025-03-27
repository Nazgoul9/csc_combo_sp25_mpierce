import java.util.Random;

public class Character {
	private Random rand = new Random();
	private int health;
	private int strength;
	private String name;
	private Weapon weapon;
	
	public Character(int health, int strength, String name, String wName, int damage) {
		super();
		this.health = health;
		this.strength = strength;
		this.name = name;
		this.weapon = new Weapon(wName, damage);
	}
	public Character() {
		super();
		this.health = 0;
		this.strength = 0;
		this.name = "";
		this.weapon = new Weapon("", 0);
	}
	
	public int doDamage()
	{
		int damage = rand.nextInt(this.strength) + rand.nextInt(this.weapon.damage);
		return damage;
		
	}
	
	public void recieveDamage(int damage)
	{
		this.health -= damage;
	}
	
	
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		return "character [health=" + health + ", strength=" + strength + ", name=" + name + "]\n" + weapon;
	}
	
	

}
