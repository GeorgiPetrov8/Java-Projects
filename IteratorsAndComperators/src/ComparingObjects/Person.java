package ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    private String town;


    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
       int first = this.name.compareTo(person.getName());
       int second = this.age.compareTo(person.getAge());
       int third = this.town.compareTo(person.getTown());

       if (first == 0 && second == 0 && third == 0) {
           return 0;
       }
       return -1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }
}
