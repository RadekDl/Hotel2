import java.time.LocalDate;
import java.util.List;

public class Booking {

        private LocalDate reservationOn;    //datum rezervace od
        private LocalDate reservationOff;    //datum rezervace do
        private Room room;
        private List <Customer> customer;
        private boolean stay;


        public Booking(LocalDate reservationOn, LocalDate reservationOff, Room room, List<Customer> customer,
                       boolean stay) {
                this.reservationOn = reservationOn;
                this.reservationOff = reservationOff;
                this.room = room;
                this.customer = customer;
                this.stay = stay;
        }

        public Booking() {

        }


        public LocalDate getReservationOn() {
                return reservationOn;
        }

        public void setReservationOn(LocalDate reservationOn) {
                this.reservationOn = reservationOn;
        }

        public LocalDate getReservationOff() {
                return reservationOff;
        }

        public void setReservationOff(LocalDate reservationOff) {
                this.reservationOff = reservationOff;
        }

        public Room getRoom() {
                return room;
        }

        public void setRoom(Room room) {
                this.room = room;
        }

        public List<Customer> getCustomers() {
                return customer;
        }
        public Customer getMainCustomer() {
                return customer.getLast() ;
        }

        public void setCustomer(List<Customer> customer) {
                this.customer = customer;
        }

        public boolean isStay() {
                return stay;
        }

        public void setStay(boolean stay) {
                this.stay = stay;
        }



}


