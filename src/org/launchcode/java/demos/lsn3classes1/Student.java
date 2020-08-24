package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        //transfer student
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) { //new student
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setName(String aName) {
        this.name = aName;
    }

//    public void setStudentId(int aStudentId) {
//        this.studentId = aStudentId;
//    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

}