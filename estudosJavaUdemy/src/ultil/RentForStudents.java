package ultil;

public class RentForStudents {
    private String name;
    private String email;


    public RentForStudents(String name, String email, int room) {
        this.name = name;
        this.email = email;

    }

    public RentForStudents(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
      return ": " + name + ", " + email;
    }
}
