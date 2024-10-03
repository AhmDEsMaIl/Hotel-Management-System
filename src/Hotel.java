import java.util.HashMap;
import java.util.Scanner;
public class Hotel {
    private  HashMap<Integer,Room> rooms = new HashMap<>();
    public Hotel() {
      rooms = new HashMap<>();
    }

    public  boolean addRoom(Room room) {
        rooms.put(room.getRoomNumber() , room );
        return true;
    }
    public  Room getRoom(int roomNumber) {
        return rooms.get(roomNumber);
    }
    public  boolean bookRoom(int roomNumber, Service service){
        Room room = rooms.get(roomNumber);
        room.Booked();
        room.addService(service);
        System.out.println("Added "+service.getName()+" to "+room.getDescription());
        System.out.print("- Room "+room.getRoomNumber());
        return true;
    }
    public  void displayBookingDetails(int roomNumber){
        Room room = rooms.get(roomNumber);
        System.out.println("Room Name : "+room.getDescription()+"\nRoom Number : "+room.getRoomNumber());
        System.out.println("Room Cost:"+room.getTotalCost()+"$");

    }
}
