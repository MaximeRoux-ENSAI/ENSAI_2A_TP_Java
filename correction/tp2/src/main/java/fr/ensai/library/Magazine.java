package fr.ensai.library;

public class Magazine extends Item {
    // Attributes
    private String issn;
    private String issueNumber;

<<<<<<< HEAD
    // Constructor
=======
    /**
     * Constructs a new Magazine object.
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Magazine(String issn, String title, String issueNumber, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Magazine " + title;
=======
        return String.format("Magazine %s", this.title);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

}
