package Assignment20;

import java.io.*;

class Student3 implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try {
            // Serialization
            Student3 s3 = new Student3(1, "Kranti");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s3);
            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

            // Deserialization
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Data:");
            System.out.println(s2.id + " " + s3.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}