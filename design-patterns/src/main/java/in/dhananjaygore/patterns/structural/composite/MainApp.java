package in.dhananjaygore.patterns.structural.composite;

public class MainApp {

	public static void main(String[] args) {
		SongComponent playlist1 = new PlayList("playlist_1");
		SongComponent playlist2 = new PlayList("playlist_2");
		SongComponent playlist3 = new PlayList("playlist_3");
		SongComponent myplaylist = new PlayList("myplaylist");
		myplaylist.add(playlist1);
		myplaylist.add(playlist2);
		playlist1.add(new Song("Song1"));
		playlist1.add(new Song("Song2"));
		playlist1.add(playlist3);
		playlist3.add(new Song("Song3"));

		myplaylist.displaySongInfo();
	}

}
