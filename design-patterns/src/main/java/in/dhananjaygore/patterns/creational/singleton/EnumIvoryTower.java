package in.dhananjaygore.patterns.creational.singleton;

public enum EnumIvoryTower {

	INSTANCE("instance");
	
	private final String value;

	private EnumIvoryTower(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
