package fr.ensai.mediaplayer;

import java.util.List;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    private int totalDuration;

    /**
     * Constructs a new Song object.
     *
     * @param name      The name of the Playlist.
     * @param mediaList The list of media int the Playsit.
     * @param duration  The duration of the Playlist in seconds.
     */
    public Playlist(String name, List<Media> mediaList, int totalDuration){
        this.name = name;
        this.mediaList = mediaList;
        this.totalDuration = totalDuration;
    }

    /**
     * Adds a media item to the playlist.
     *
     * @param media The media to add.
     */
    public void addMedia(Media media){
        this.mediaList.add(media);
        this.totalDuration += media.duration;
    }

     /**
     * Removes a media from the playlist.
     *
     * @param media The media to remove.
     * @return true If the media was in the Playlist.
     */
    public boolean removeMedia(Media media) {
        int nbOccurences = 0;
        while (this.mediaList.remove(media)) {
            this.totalDuration -= media.getDuration();
            nbOccurences++;
        }
        return nbOccurences > 0;
    }
}
