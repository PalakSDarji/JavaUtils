import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class practice2 {

    static Comparator<Person> ageComparator = (p1,p2) -> p2.age - p1.age;

    public static void main(String[] args){

        PriorityQueue<Person> pq = new PriorityQueue<>(ageComparator);

        Person p1 = new Person("Palak",28);
        Person p3 = new Person("Palak",28);
        pq.offer(p1);
        Person p2 = new Person("Dhara",27);
        pq.offer(p2);

        System.out.println(pq);

        System.out.println(p1.equals(p3));
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
