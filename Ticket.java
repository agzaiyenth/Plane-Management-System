// Ticket.java
import java.io.FileWriter;
import java.io.IOException;
public class Ticket {
    private String row;
    private int seat;
    private double price;
    private Person person;


    public Ticket(String row, int seat, double price, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;

    }

    // Getters and setters

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void save() {
        String filename = row + (seat+1) + ".txt"; // Generate filename based on row and seat number
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Person Information:\n");
            writer.write("Name: " + person.getName() + "\n"+"Surname: " + person.getSurname() + "\n"+"Email: " + person.getEmail() + "\n");
            writer.write("Ticket Information:\n"+"Row: " + row + "\n"+"Seat: " + (seat + 1) + "\n"+"Price: " + price + "\n");
            System.out.println("Ticket information saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error occurred while saving ticket information to file: " + e.getMessage());
        }
    }

    public void printInfo() {
        System.out.println("Person Information:");
        person.printInfo();
        System.out.print("  Row: " + row);
        System.out.println(" Seat: " + (seat+1));
        System.out.println("  Price: " +price);
    }
}
