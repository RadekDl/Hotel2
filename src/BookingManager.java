import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> booking;
    private Room room;
    private Customer customer;


    public List<Booking> getBooking() {
        return booking;
    }
    public void setBooking(List<Booking> booking) {
        this.booking = new Booking(LocalDate.of(2024,11,1),room,List.of(customer));
    }



}

