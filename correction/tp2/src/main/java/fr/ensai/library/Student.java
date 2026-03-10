package fr.ensai.library;

public class Student extends Person {
<<<<<<< HEAD
    public int academicYear;
    public boolean isClassDelegate;

=======
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student.
     * @param name
     */
>>>>>>> dd8a231b0c3fe8d317f6cb28620f2bd9867f27de
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }
}