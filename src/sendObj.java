import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class sendObj {
    public static void main(String[] args) {

        Student student = new Student(1, "Saida", "Aslanzade", "seideaslanzade@gmail.com");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            System.out.println("Object serialization is successful");

            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
