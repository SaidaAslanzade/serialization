import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private transient String email;

    public Student(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


}
