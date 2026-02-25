package Assignment20;
class Student1 implements Comparable<Student1> {

    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student1 s) {
        return this.id - s.id;   // sorting by id
    }
}