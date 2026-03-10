package fr.ensai.library;

public class Person {

    // Attributes
<<<<<<< HEAD
    public String name;
    public int age;

    // Constructor
=======
    protected String name;
    protected int age;

    /**
     * Constructs a new Person.
     * @param name
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Person(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    // Constructor
=======
    /**
     * Constructs a new Person.
     * @param name
     * @param age
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void birthday() {
        this.age += 1;
    }

    public String toString() {
<<<<<<< HEAD
        return this.getClass() + " " + this.name;
=======
        return String.format("%s %s",this.getClass().getSimpleName(), this.name);
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    }
}
