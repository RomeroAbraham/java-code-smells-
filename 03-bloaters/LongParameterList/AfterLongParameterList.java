class BookingRequest {
    private final String clientName;
    private final String clientEmail;
    private final String hotelName;
    private final String checkInDate;
    private final String checkOutDate;
    private final int roomNumber;
    private final boolean hasBreakfast;

    public BookingRequest(String clientName, String clientEmail, String hotelName, 
                          String checkInDate, String checkOutDate, int roomNumber, boolean hasBreakfast) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.hotelName = hotelName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
        this.hasBreakfast = hasBreakfast;
    }

    public String getClientName() { return clientName; }
    public String getHotelName() { return hotelName; }
}

public class HotelBookingService {
    public void createBooking(BookingRequest request) {
        System.out.println("Reserva creada para " + request.getClientName() + " en " + request.getHotelName());
    }
}
