package se.syntax.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericJava {
    public static void main(String[] args) {
        List<Person> ps = new ArrayList<Person>();
        ps.add(new Person("za", 1));
        ps.add(new Student("a", "a"));

        List<? extends Person> persons = new ArrayList<Student>();

        test(new ArrayList<Person>());
        test(new ArrayList<Student>());
    }

    public static void test(List<? extends Person> persons) {}
}
