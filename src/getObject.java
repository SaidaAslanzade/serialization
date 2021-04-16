import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class getObject {
    public static void main(String[] args) {

        Student student = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("student.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Id: " + student.getId() + " Name: " + student.getName() + " Surname: " + student.getSurname() + " Email: " + student.getEmail());
    }
}
