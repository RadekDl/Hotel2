import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Adéla", "Malíková", LocalDate.of(
                1993, 3, 13));
        Customer customer2 = new Customer("Jan", "Dvořáček", LocalDate.of(
                1995, 5, 5));

    }

    Room room1 =new Room(1,1,true,true,1000);
    Room room2 =new Room(2,1,true,true,1000);
    Room room3 =new Room(3,3,false,true,2400);


}