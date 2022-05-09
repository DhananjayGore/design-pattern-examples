package in.dhananjaygore.patterns.creational.builder;


public enum Profession {

WARRIOR("warrior"),
THIEF("thief"),
MAGE("mage"),
PRIEST("priest");


private String value;

private Profession(String value) {
	this.value = value;
}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return String.valueOf(value);
}

}
