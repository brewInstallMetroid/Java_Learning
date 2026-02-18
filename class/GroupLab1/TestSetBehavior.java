package GroupLab1;
import java.util.Set;
import java.util.TreeSet;
public class TestSetBehavior {
    public static void main(String[] args) {
        
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 3);

        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        System.out.println("TreeSet:");
        for (Person p : treeSet) {
            System.out.println("" + p);
        }

    }
}
