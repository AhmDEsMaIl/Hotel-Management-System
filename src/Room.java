import java.util.*;
public abstract class Room {
    private int roomNumber;
    private int baseRate;
    private int service_coast ;
    private char book_state;
    private List<List<String>> services = new ArrayList<>();
    public Room(){

    }
   public Room(int roomNumber, int baseRate) {
       this.roomNumber = roomNumber;
       this.baseRate = baseRate;
   }
   public int getRoomNumber() {
       return roomNumber;
   }
   public boolean addService(Service service) {
           switch(service.getName())
           {
               case "SpaService":
                   service_coast+=service.getCost();
                   break;
               case "DiningService":
                   service_coast+=service.getCost();
                   break;
               case "GymService":
                   service_coast+=service.getCost();
                   break;
                   default:
                       return false;

           }
           return true;
   }
   public int getTotalCost(){
       return service_coast+baseRate;
   }
   public boolean Booked(){
        book_state=0;
        return false;
   }
    public boolean unBooked(){
        book_state=1;
        return true;
    }
   public abstract String getDescription();
}
