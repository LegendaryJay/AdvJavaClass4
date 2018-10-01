import java.util.ArrayList;

public class Startup {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Jack", "Reacher", 12));
        people.add(new Person("Bill", "Mitch", 26));
        people.add(new Person("Dan", "Sanders", 19));
        people.add(new Person("Tom", "Smith", 64));
        people.add(new Person("Rebecca", "Scratch", 28));
        people.add(new Person("Melissa", "Slaughter", 32));
        people.add(new Person("Andrea", "York", 56));
        people.add(new Person("Cal", "Ger", 90));

        for (Person guy: people
             ) {
            System.out.println(guy.toString());
        }
        System.out.println(Person.getNumPeople());
    }
}
