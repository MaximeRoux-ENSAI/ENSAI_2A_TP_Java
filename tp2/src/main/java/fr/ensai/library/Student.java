package fr.ensai.library;

/**
 * Represents a Student
 */
public class Student {
    // -------------------------------------------------------
    // Attributes name, age, academicYear, isClassDelegate
    // -------------------------------------------------------
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student
     * 
     * @param name             le nom de l'étudiant
     * @param age              l'age de l'étudiant
     * @param academicYear     L'année sco de l'étudiant
     * @param isClasseDelegate est délégué ou non
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

}