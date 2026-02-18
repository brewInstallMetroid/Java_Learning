package GroupLab1;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable <Person> {

	private String name;
	private int id;

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}	
	public int getId() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Person)) return false;
		Person other = (Person) obj;
		return this.id == other.id;
	}

	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nID: " + this.id;
	}
}
