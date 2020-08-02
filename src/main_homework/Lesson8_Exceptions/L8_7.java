/* In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
 these methods (check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
public class Example {
    private final String first, last;
    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }
    @Override
    public boolean equals(Object o) {
        return false;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example(""Donald"", ""Duck""));
        System.out.println(s.contains(new Example(""Donald"", ""Duck"")));
    }
}*/

 package main_homework.Lesson8_Exceptions;

import java.util.HashSet;
import java.util.Set;

public class L8_7 {

    private final String first, last;
    public L8_7(String first, String last) {
        this.first = first;
        this.last = last;
    }

public static void main(String[] args) {
        Set<L8_7> s = new HashSet<>();
        s.add(new L8_7("Donald", "Duck")); //calling add method of HashSet (like array) create and put new object with its values
        System.out.println(s.contains(new L8_7("Donald", "Duck")));
}

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof L8_7)) return false;
        if (getClass() != o.getClass()) return false;
        L8_7 c = (L8_7) o;
        return this.first == c.getFirst() && this.last == c.getLast();
    }

        @Override
    public int hashCode() {
        return (7 * first.hashCode() + 11 * last.hashCode());
    }}





