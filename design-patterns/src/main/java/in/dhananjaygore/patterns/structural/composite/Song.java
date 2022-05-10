package in.dhananjaygore.patterns.structural.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Song extends SongComponent {
    String songName;

    @Override
    public String getSong() {
        return songName;
    }

    @Override
    public void displaySongInfo() {
        System.out.println("Song: " + songName);
    }
}
