package in.dhananjaygore.patterns.structural.composite;

public abstract class SongComponent {

	public void add(SongComponent c) {
        throw new UnsupportedOperationException();
    }

    public String getSong() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
