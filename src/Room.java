public class Room {

        private int roomOfNumber; // číslo pokoje
        private int numberOfBeds; //poče lůžek
        private boolean isBalcon;    // balkón
        private boolean isSeaView; // výhled na moře
        private double price;    // cena za pokoj

    public int getRoomOfNumber() {
        return roomOfNumber;
    }

    public void setRoomOfNumber(int roomOfNumber) {
        this.roomOfNumber = roomOfNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean getIsBalcon() {
        return isBalcon;
    }

    public void setBalcon(boolean balcon) {
        this.isBalcon = isBalcon;
    }

    public boolean getIsSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        this.isSeaView = isSeaView;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Room(int roomOfNumber, int numberOfBeds, boolean isBalcon, boolean isSeaView, double price) {
        this.roomOfNumber = roomOfNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcon = isBalcon;
        this.isSeaView = isSeaView;
        this.price = price;
    }
}

