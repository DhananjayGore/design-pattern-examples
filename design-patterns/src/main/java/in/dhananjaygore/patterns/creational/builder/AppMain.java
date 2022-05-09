package in.dhananjaygore.patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppMain {

	public static void main(String[] args) {
		var mage = new Hero.HeroBuilder(Profession.MAGE, "John")
				.withHairColor(HairColor.BLACK)
				.withArmor(Armor.CHAIN_MAIL)
				.build();
		
		log.info("mage : " + mage.toString());

	}

}
