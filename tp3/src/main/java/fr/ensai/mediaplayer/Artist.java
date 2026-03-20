package fr.ensai.mediaplayer;

import java.util.Objects;

public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Constructs a new Artist object.
     *
     * @param firstName   The first name of the artist.
     * @param lastName    The last name of the artist.
     * @param nationality The nationality of the artist.
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    @Override
    /**
     * Returns the full name of the artist.
     *
     * @return The first name followed by last name.
     */
    public String toString() {
        return String.format("Artist %s %s", this.firstName, this.lastName);
    }
}
