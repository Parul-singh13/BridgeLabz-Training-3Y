class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Rita";
        this.roomType = "Delux";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
void displayBookDetail(){
    System.out.println("Guest Name" +guestName);
    System.out.println("Room Type" +roomType);
    System.out.println("Days to stay"+nights);



}
public static void main(String[] args) {
    //Default
    HotelBooking booking1 = new HotelBooking();
    booking1.displayBookDetail();
//Parametrized
    HotelBooking booking2 = new HotelBooking("John Doe", "Suite", 3);
    booking2.displayBookDetail();
    //Copy

    HotelBooking booking3 = new HotelBooking(booking2);
    booking3.displayBookDetail();
}
}