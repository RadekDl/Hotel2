import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Adéla", "Malíková", LocalDate.of(
                1993, 3, 13));
        Customer customer2 = new Customer("Jan", "Dvořáček", LocalDate.of(
                1995, 5, 5));

        customer2.setBirthday(LocalDate.of(1995,4,5));

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);


        System.out.println("\n"+ customer1.getFirstName()+" "+ customer1.getSecondName()+ " "+
                customer1.getBirthday());
        System.out.println("\n"+ customer2.getFirstName()+" "+ customer2.getSecondName()+ " "+
                customer2.getBirthday());

        System.out.println("\nPokoj číslo "+room1.getRoomOfNumber()+ " a pokoj číslo "+
                room2.getRoomOfNumber()+ " jsou "+ room1.getNumberOfBeds()+ " lůžkové "+
                " za cenu "+ room1.getPrice()+"Kč/noc." +"\n Další vybavení: balkón: "+
                room1.getIsBalcon()+","+" Výhled na moře: "+room1.getIsSeaView()+".");
        System.out.println("\nPokoj číslo "+room3.getNumberOfBeds()+" je "+ room1.getNumberOfBeds()+"lůžkový"+
                " za cenu "+ room3.getPrice()+"Kč/noc."+"\n Další vybavení: balkón: "+ room3.getIsBalcon()+
                " Výhled na moře: "+ room3.getIsSeaView());


        Booking booking1 = new Booking(LocalDate.of(2021,7,1),LocalDate.of(
                2021,7,19),room1,List.of(customer1),true);
        Booking booking2 = new Booking(LocalDate.of(2021,9,1),LocalDate.of(
                2021,9,14),room3,List.of(customer1,customer2),false);




        System.out.println("\n Rezervace pokoje číslo "+ room1.getRoomOfNumber()+" je od "+
                            booking1.getReservationOn()+" do "+ booking1.getReservationOff()+
                            " klientem, "+ booking1.getCustomer().getFirst().getSecondName()+
                            "\n a pobyt je pracovní "+ booking1.isStay());

        System.out.println("\n Rezervace pokoje číslo "+room3.getRoomOfNumber()+" je "+ "od "
                +booking2.getReservationOn()+" do "+booking2.getReservationOff()+" klientem/ty"+","+" "
                + booking2.getCustomer().getFirst().getSecondName()+", "+
                booking2.getCustomer().get(1).getSecondName()+" a pobyt je pracovní "+booking2.isStay()+"\n");


        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);

        for (Booking bookingPrint : bookings) {
            System.out.println("Začátek rezervace, "+bookingPrint.getReservationOn()+
                    "\n Konec rezervace, "+ bookingPrint.getReservationOff()+"\n zákazníkem, "+
                    bookingPrint.getCustomer());
        }



    }
}