package Lesson6.Test2;

public class PassByReference {
    public static void main(String[] args) {
        Person klur = new Person("klur", 21);
        System.out.println(klur);
        doSthToPerson(klur);
        System.out.println(klur);
    }

    public static void doSthToPerson (Person person) {
        System.out.println(person.getAge()+1);
        person.setAge(23);
        System.out.println(person.getAge());
        person = new Person("pol",1);
        System.out.println(person);
        System.out.println(person.getAge());
    }

}
