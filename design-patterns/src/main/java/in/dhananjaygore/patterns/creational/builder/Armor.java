package in.dhananjaygore.patterns.creational.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Armor {

	CLOTHES("clothes"),
	LEATHER("leather"),
	CHAIN_MAIL("chain mail"),
	PLATE_MAIL("plate mail");
	
	private final String value;
	
	@Override
	public String toString() {
		return value;
	}
	
}
