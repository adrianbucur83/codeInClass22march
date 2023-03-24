package sets;

import java.util.HashSet;
import java.util.Set;

public class PeopleManager {

    public Set<Person> personSet = new HashSet<>();

    public boolean addPersons(Person person) {
        System.out.println("doing stuff before adding");
        return personSet.add(person);
    }

    public void viewAllPersons() {
        for (Person person: personSet) {
            System.out.println(person);
        }
    }
}
