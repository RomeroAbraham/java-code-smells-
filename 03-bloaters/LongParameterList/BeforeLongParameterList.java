public class HotelBookingService {
    public void createBooking(String clientName, String clientEmail, String hotelName, 
                              String checkInDate, String checkOutDate, int roomNumber, boolean hasBreakfast) {
        System.out.println("Reserva creada para " + clientName + " en " + hotelName);
    }
}
