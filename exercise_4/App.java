import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> HotelReservation = new LinkedList<>();

        HotelReservation.add("Justine Nica");
        HotelReservation.add("Ronn");
        HotelReservation.add("Idel Lawrence");
        HotelReservation.add("Winna Jane");
        HotelReservation.add("Jap");

        System.out.println("Enqueue " + HotelReservation);

        System.out.println("The Size of the queue " + HotelReservation.size());
        System.out.println("The front of the queue " + HotelReservation.peek());

        System.out.println("Dequeue " + HotelReservation);

        HotelReservation.remove();
        HotelReservation.remove();
        HotelReservation.remove();
        HotelReservation.remove();
        HotelReservation.remove();


        HotelReservation.add("Lars");
        HotelReservation.add("Kenneth");
        HotelReservation.add("Alexander");
        HotelReservation.add("Ivan");
        HotelReservation.add("Jonnah");

        System.out.println("Enqueue " + HotelReservation);

        System.out.println("The Size of the queue " + HotelReservation.size());
        System.out.println("The front of the queue " + HotelReservation.peek());
    }
}