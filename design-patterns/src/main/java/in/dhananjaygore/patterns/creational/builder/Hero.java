package in.dhananjaygore.patterns.creational.builder;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public final class Hero {
	
	

	private final Armor armor;
	private final HairColor color;
	private final HairType hairType;
	private final Profession profession;
	private final Weapon weapon;
	
	private Hero(HeroBuilder builder) {
		this.armor = builder.armor;
		this.color = builder.color;
		this.hairType =  builder.hairType;
		this.profession = builder.profession;
		this.weapon = builder.weapon;
	}
	
	public static class HeroBuilder{

		private final String name;
		private Armor armor;
		private HairColor color;
		private HairType hairType;
		private Profession profession;
		private Weapon weapon;
		
		public HeroBuilder(Profession profession, String name) {
			if(profession == null || name == null) {
				throw new IllegalArgumentException("Professional or name can be null");
			}
			this.profession = profession;
			this.name =  name;
		}
		
		public HeroBuilder withHairColor(HairColor color) {
			this.color = color;
			return this;
		}
		
		public HeroBuilder withArmor(Armor armor) {
			this.armor = armor;
			return this;
		}
		
		public HeroBuilder withHairType(HairType hairType) {
			this.hairType = hairType;
			return this;
		}
		
		public HeroBuilder withProfession(Profession profession) {
			this.profession = profession;
			return this;
		}
		
		public HeroBuilder withWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public Hero build() {
			// TODO Auto-generated method stub
			return new Hero(this);
		}
	}
}
