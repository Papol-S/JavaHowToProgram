package Lesson3.Exercise3_14;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public static void monthlySalaryCheck(double monthlySalary){
        if (monthlySalary < 0){
            throw new RuntimeException("Monthly salary is lower than zero");
        }
    }

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        monthlySalaryCheck(monthlySalary);
        this.monthlySalary = monthlySalary;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double yearlySalary(){
        double yearlySalary = 0.0;
        yearlySalary = 12*monthlySalary;
        return yearlySalary;
    }


}
