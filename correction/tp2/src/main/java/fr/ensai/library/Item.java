package fr.ensai.library;

public abstract class Item {
    protected String title;
    protected int year;
    protected int pageCount;

<<<<<<< HEAD
    public Item(String title, int year, int pageCount) {
=======
    /**
     * Common constructor for Items.
     */
    protected Item(String title, int year, int pageCount) {
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    // Abstract method to enforce implementation in child classes
    public abstract String toString();

    public String getTitle() {
<<<<<<< HEAD
        return title;
=======
        return this.title;
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

}
