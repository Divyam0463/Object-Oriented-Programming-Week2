public class MovieTicket {
  String movieName ; 
  String seatNumber; 
  int price ; 
  int seats ; 
  public MovieTicket(String movieName , int price ){
    this.movieName = movieName ; 
    this.price = price ; 
    this.seatNumber = "" ; //empty seats
    this.seats = 0 ; //0 seats sold
  }

  void assignSeat(String seatNumber ,int price ){
    this.seatNumber += (seatNumber+" ") ; 
    this.seats+=1 ; 
    this.price += price ;

  }
  void displayTickets(){
    System.out.println("Movie: "+movieName);
    System.out.println("seat: "+seatNumber);
    System.out.println("price: "+price);
    System.out.println("seats: "+seats);
    System.out.println("-----------------------");
  }
  public static void main(String[] args) {
    MovieTicket mt1 = new MovieTicket("chava", 100) ; 
    MovieTicket mt2 = new MovieTicket("znmd", 80) ; 

    mt1.assignSeat("39", 100);
    mt1.assignSeat("40", 100);

    mt2.assignSeat("20", 80);

    mt1.displayTickets();
    mt2.displayTickets();
  }
}
