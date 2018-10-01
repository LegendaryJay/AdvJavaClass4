public class Person implements Weightable {
    public String firstName;
    public String lastName;
    public int age;
    public static int numPeople = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        numPeople++;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumPeople() {
        return numPeople;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " [" + age + " yrs]";
    }

    @Override
    public void addWeight(double pounds) {
        System.out.println("Added Weight");
    }

    @Override
    public void lossweight(double pounds) {
        System.out.println("Lost Weight");
    }
}
