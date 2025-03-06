public class HotelBooking {
  String guestName;
  String roomType;
  int nights;

  //default
  public HotelBooking(){
    this.guestName = "Unknown" ; 
    this.roomType = "normal" ; 
    this.nights = 1 ; 
  }

  //parameterised 
  public HotelBooking(String guestName, String roomType, int nights) {
    this.guestName = guestName;
    this.roomType = roomType;
    this.nights = nights;
  }

  //copy constructor
  public HotelBooking(HotelBooking other){
    this.guestName = other.guestName ; 
    this.roomType = other.roomType ; 
    this.nights = other.nights ;
  }
  public void display(){
    System.out.println("Bookings: ");
    System.out.println("Guestname: "+this.guestName);
    System.out.println("room-type: "+this.roomType);
    System.out.println("Nights: "+this.nights);
  }

  public static void main(String[] args) {
    HotelBooking hb1 = new HotelBooking() ;
    HotelBooking hb2 = new HotelBooking("iyer", "king-size", 2) ; 
    HotelBooking hb3 = new HotelBooking(hb2);

    System.out.println("default: ") ; 
    hb1.display() ;
    System.out.println("\nParameterised: ") ; 
    hb2.display() ;
    System.out.println("\nCopied: ") ; 
    hb3.display() ;
  }
}
