package Lesson3.Exercise3_14;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Peter","Parker",25000);
        Employee employee2 = new Employee("Andrew","Garfeild",76000);

        employee1.getFirstName();
        employee1.yearlySalary();
        System.out.printf("Yearly salary of employee1 is %.2f\n",employee1.yearlySalary());

        System.out.printf("Yearly salary of employee2 is %.2f\n",employee2.yearlySalary());
    }
}
