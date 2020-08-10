public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private void setFirstName(String firstName) {
        validateName(firstName, "first");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        validateName(lastName, "last");
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be int range [0 ... 120]");
        }
        this.age = age;
    }

    private void validateName(String name, String paramName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("The " + paramName + " name cannot be null or empty");
        }
    }
}
