public class StandardRoom  extends Room {
    public StandardRoom(int roomNumber, int baseRate){
        super(roomNumber, baseRate);
    }
    public  String getDescription() {
        return "Standard Room";
    }
}
