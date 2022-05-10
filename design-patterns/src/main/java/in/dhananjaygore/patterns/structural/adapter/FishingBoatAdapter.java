package in.dhananjaygore.patterns.structural.adapter;

public class FishingBoatAdapter implements RowingBoat {

	private final FishingBoat boat = new FishingBoat();

	@Override
	public  final void row() {
		boat.sail();
	}
	
	
}
