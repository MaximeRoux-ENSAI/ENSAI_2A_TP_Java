package fr.ensai.mediaplayer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PlaylistTest {

    @Test
    void testAddMedia() {
        // GIVEN
        Playlist playlist = new Playlist("Test playlist", null, 0);
        Artist moi = new Artist("Maxime", "ROUX", "Everywhere");
        Song sonDuFutur = new Song("Super song", moi, 0, 40, "Hello, it's me", moi, moi, null);

        // WHEN
        playlist.addMedia(sonDuFutur);

        // THEN
        assertNotNull();
    };
}
