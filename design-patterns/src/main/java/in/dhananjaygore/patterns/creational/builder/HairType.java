package in.dhananjaygore.patterns.creational.builder;

public enum HairType {

	BALD("bald"),
	SHORT("short"),
	CURLY("curly"),
	LONG_STRAIGHT("long straight"),
	LONG_CURLY("long curly");
	
	private final String value;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}

	private HairType(String value) {
		this.value = value;
	}
	
	
}
