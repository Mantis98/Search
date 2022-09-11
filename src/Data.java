import java.util.Scanner;

public class Data extends Person {

    long personalId;

    Data(String name, String surname, long personalId) {
        super(name, surname);
        this.personalId = personalId;
    }

    void showPerson() {
        System.out.println(name + surname);
    }

    public String toString() {
        return name + " " + surname + " " + personalId;
    }

    void searchById() {
        Scanner id = new Scanner(System.in);

        System.out.println("Enter person ID: ");
        long l = id.nextLong();

        if (l == personalId) {
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
        } else {
            System.out.println("Person not found");
        }
    }

}
