package ro.ase.csie.cts.g1092.dp.builder;

public class Superhero {
	String name;
	int lifePoints;
	boolean isVillain;
	boolean isCriticallyWounded;
	
	Weapon leftHandWeapon;
	Weapon rightHandWeapon;
	
	String superPower;
	String superSuperPower;
	
	private Superhero() { 
		
	}

	public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticallyWounded,
			Weapon leftHandWeapon, Weapon rightHandWeapon, String superPower, String superSuperPower) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isCriticallyWounded = isCriticallyWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperheroBuilder {
		Superhero superhero = null;
		
		public SuperheroBuilder(String name, int lp) {
			this.superhero = new Superhero();
			this.superhero.name = name;
			this.superhero.lifePoints = lp;
		}
		
		public SuperheroBuilder isVillain() {
			this.superhero.isVillain = true;
			return this;
		}
		
		public SuperheroBuilder isWounded() {
			this.superhero.isCriticallyWounded = true;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(Weapon weapon) {
			this.superhero.leftHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setRightWeapon(Weapon weapon) {
			this.superhero.rightHandWeapon = weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperPower(String superPower) {
			this.superhero.superPower = superPower;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperPower(String superSuperPower) {
			this.superhero.superSuperPower = superSuperPower;
			return this;
		}
		
		public Superhero build() {
			return this.superhero;
		}
	}
	
	
	
	
}
