package Lesson8.Example8_7;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date(7,24,1949);
        Date hireDate = new Date(3,12,1988);
        Employee employee1 = new Employee("Bob","Blue",hireDate,birthDate);

        System.out.println(employee1.toString());

//        Employee employee2 = new Employee("A","B",new Date(3,12,1988),new Date(7,24,1949));
//
//        System.out.println(employee2.toString());
    }
}
