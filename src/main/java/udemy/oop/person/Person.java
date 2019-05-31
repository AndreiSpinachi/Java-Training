package udemy.oop.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 | age > 100) {
            this.age = 0;
        }
        {
            this.age = age;
        }
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

    public boolean isTeen() {
        return age > 12 & age < 20 ? true : false;
    }

    public String getFullName() {
        String str = "";
        if (getFirstName().isEmpty() & getLastName().isEmpty()) {
            return str;
        } else if (getFirstName().isEmpty()) {
            return getLastName();
        } else if (getLastName().isEmpty()) {
            return getFirstName();
        }
        return getFirstName() + " " + getLastName();
    }
}
