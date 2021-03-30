package ro.ase.csie.cts.g1092.dp.builder;

import ro.ase.csie.cts.g1092.dp.builder.Superhero.SuperheroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1.create
		//Superhero superHero = new Superhero();
		//2.init
		
		Weapon Glock18 = new Weapon("Glock-18");
		Weapon Beretta = new Weapon("Beretta");
		
		Superhero superHero =
				new Superhero("The Punisher", 100, false, false, 
						Glock18, Beretta, null, "He shoots really well");
		
		Superhero superHero1 =
				new Superhero("Daredevil", 100, false, false, 
						Glock18, Beretta, null, "He is blind");
		
		
		//builder
		Superhero punisher =
				new Superhero.SuperheroBuilder("The Punisher", 100)
				.setLeftWeapon(Beretta)
				.setRightWeapon(Glock18)
				.setSuperPower("He shoots pew pew")
				.setSuperSuperPower("He's cool")
				.isVillain()
				.build();
			
		Superhero daredevil = 
				new Superhero.SuperheroBuilder("Daredevil", 100)
				.isWounded()
				.setRightWeapon(Beretta)
				.setSuperPower("Blindness").build();
		
		Superhero dummy = 
				new Superhero.SuperheroBuilder("Dummy", 20).build();
	}

}
