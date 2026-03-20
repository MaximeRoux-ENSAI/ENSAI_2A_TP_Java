package fr.ensai.mediaplayer;

/**
 * Represents a podcast.
 */
public class Podcast extends Media {
    private String host;
    private String topic;
    private String subtitles;

    /**
     * Constructs a new Podcast object.
     *
     * @param title     The title of the podcast.
     * @param host      The host of the podcast.
     * @param topic     The topic of the podcast.
     * @param duration  The duration of the podcast in seconds.
     * @param year      The year the podcast was released.
     * @param subtitles The subtitles of the podcast.
     */
    public Podcast(String title, String host, String topic, int year, int duration, String subtitles) {
        super(title, duration, year);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }


    @Override
    public String getText() {
        return this.subtitles;
    }

    /**
     * Simulates playing the song by printing lyrics word by word.
     */
    public void play() {
        if (subtitles == null || subtitles.isEmpty()) {
            System.out.println("No lyrics available.");
            return;
        }

        String[] words = subtitles.split(" ");

        for (String word : words) {
            System.out.print(word + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Podcast interrupted.");
            }
        }

        System.out.println(); // retour à la ligne à la fin
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format("Podcast %s by %s", this.title, this.host);
    }
}