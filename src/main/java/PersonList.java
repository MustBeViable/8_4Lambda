import java.util.ArrayList;
import java.util.Comparator;

public class PersonList {
    private final ArrayList<Person> personList = new ArrayList<>();

    public void addPersons() {
        personList.add(new Person("Elias", 32, "Espoo"));
        personList.add(new Person("Anna", 27, "Helsinki"));
        personList.add(new Person("Mikko", 45, "Tampere"));
        personList.add(new Person("Laura", 38, "Turku"));
        personList.add(new Person("Janne", 29, "Oulu"));
        personList.add(new Person("Sofia", 34, "Jyväskylä"));
        personList.add(new Person("Petri", 41, "Lahti"));
        personList.add(new Person("Kaisa", 30, "Kuopio"));
        personList.add(new Person("Timo", 36, "Vaasa"));
        personList.add(new Person("Maria", 25, "Joensuu"));
        personList.add(new Person("Antti", 50, "Rovaniemi"));
        personList.add(new Person("Emma", 28, "Seinäjoki"));
        personList.add(new Person("Ville", 33, "Porvoo"));
        personList.add(new Person("Noora", 31, "Lappeenranta"));
        personList.add(new Person("Juha", 39, "Kajaani"));
        personList.add(new Person("Sara", 24, "Kokkola"));
        personList.add(new Person("Marko", 42, "Kotka"));
        personList.add(new Person("Oona", 26, "Mikkeli"));
        personList.add(new Person("Jussi", 37, "Salo"));
        personList.add(new Person("Henna", 35, "Pori"));
    }



    public ArrayList<Person> getList() {
        return this.personList;
    }



    public static void main(String[] args) {
        PersonList pl = new PersonList();
        pl.addPersons();
        System.out.println("Alkuperäinen lista: ");
        for (Person p : pl.personList) {
            System.out.println(p.toString());;
        }
        pl.getList().sort(Comparator.comparing(Person::getAge));
        System.out.println(" ");
        System.out.println("Lista ikäjärjestyksessä: ");
        for (Person p : pl.personList) {
            System.out.println(p.toString());;
        }
        pl.getList().removeIf(p -> !p.getCity().equalsIgnoreCase("Helsinki"));

        System.out.println(" ");
        System.out.println("Lista Helsinkiläisistä: ");
        for (Person p : pl.personList) {
            System.out.println(p.toString());;
        }
    }


}
