package fr.ensai.library;

import java.util.Objects;

public class Author extends Person {

    // Attributes
<<<<<<< HEAD
    public String nationality;

    // Constructor
=======
    private String nationality;

    /**
     * Constructs a new Author.
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Author(String name) {
        super(name);
    }

    // Methods
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
<<<<<<< HEAD
        return Objects.equals(name, author.name);
=======
        return Objects.equals(this.name, author.name);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Author " + name;
=======
        return String.format("Author %s", this.name);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }
}
