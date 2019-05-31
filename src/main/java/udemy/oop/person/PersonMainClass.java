package udemy.oop.person;

public class PersonMainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Alex");
        person.setLastName("Macedon");
        person.setAge(20);

        System.out.println(person.isTeen() + "\n" + person.getFullName());
    }
}
