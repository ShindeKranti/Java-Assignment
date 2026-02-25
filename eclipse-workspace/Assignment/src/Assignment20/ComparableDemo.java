package Assignment20;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {

        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1(3, "A"));
        list.add(new Student1(1, "B"));
        list.add(new Student1(2, "C"));

        Collections.sort(list);

        for (Student1 s1 : list) {
            System.out.println(s1.id + " " + s1.name);
        }
    }
}