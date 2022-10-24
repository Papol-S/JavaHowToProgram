package Lesson8.Example8_7;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }

    @Override
    public String toString() {
        return String.format("%s %s Hired : %s Birthday : %s",firstName,lastName,hireDate,birthDate);
    }
}
