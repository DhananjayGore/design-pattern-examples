package in.dhananjaygore.patterns.creational.builder;

public enum Weapon {

	DAGGER, SWORD, AXE, WARHAMMER, BOW;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name().toLowerCase();
	}
}
