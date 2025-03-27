
public class driver {
	
	public static void main(String[] args) {
		Character hero = new Character();
		Weapon sword = new Weapon("sword",35);
		Weapon claws = new Weapon("claws",25);
		hero.setName("BBEG");
		hero.setHealth(100);
		hero.setStrength(16);
		hero.setWeapon(sword);
		
		System.out.println(hero.toString());
		
		Character owlbear = new Character(150,14,"owly", "claws", 25);
		
		System.out.println(owlbear.toString());
		System.out.println(hero.doDamage());
		System.out.println(owlbear.doDamage());
		
		while(hero.getHealth() > 0 && owlbear.getHealth() > 0)
		{
			int dmg = hero.doDamage();
			owlbear.recieveDamage(dmg);
			System.out.println();
			dmg = owlbear.doDamage();
			hero.recieveDamage(dmg);
		}
	}
	public static void prettyprint(Character character)
	{
		System.out.println(character.getName() + has);
	}

}
