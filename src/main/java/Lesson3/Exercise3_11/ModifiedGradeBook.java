package Lesson3.Exercise3_11;

public class ModifiedGradeBook {
    private String courseName;
    private String instructorName;

    public ModifiedGradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\nThis course is presented by %s!\n",getCourseName(),getInstructorName());
    }
}
