import java.util.Comparator;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + " age: " + this.age + " city: " + this.city;
    }

}
