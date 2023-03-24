package sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {


        PeopleManager peopleManager = new PeopleManager();
        Person p1 = new Person("dsad");
        peopleManager.addPersons(new Person("AAA"));
        peopleManager.addPersons(new Person("BBB"));
        peopleManager.viewAllPersons();

    }





}
