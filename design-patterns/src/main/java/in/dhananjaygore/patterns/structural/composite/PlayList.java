package in.dhananjaygore.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayList  extends SongComponent{

	final String playListName;
	List<SongComponent> componentLst = new ArrayList<>();

    @Override
    public void add(SongComponent c) {
        componentLst.add(c);
    }

    @Override
    public void displaySongInfo() {
        System.out.println("Playlist Name: " + playListName);
        for (SongComponent s : componentLst) {
            s.displaySongInfo();
        }
    }
}
