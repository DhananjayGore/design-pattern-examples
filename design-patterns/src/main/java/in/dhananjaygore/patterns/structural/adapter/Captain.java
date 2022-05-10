package in.dhananjaygore.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
final class Captain {

	private RowingBoat rowingBoat;
	
	void row() {
		rowingBoat.row();
	}
}
