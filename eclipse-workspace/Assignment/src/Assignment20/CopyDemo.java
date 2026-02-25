package Assignment20;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    int id;
    Address address;

    Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Deep Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.address = new Address(s.address.city);
    }
}

public class CopyDemo {
    public static void main(String[] args) {

        Address addr = new Address("Pune");

        Student s1 = new Student(1, addr);

        // Shallow Copy
        Student s2 = s1;

        // Deep Copy
        Student s3 = new Student(s1);

        s1.address.city = "Mumbai";

        System.out.println("Shallow Copy City: " + s2.address.city);
        System.out.println("Deep Copy City: " + s3.address.city);
    }
}
