import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void checkInToBedroom(ArrayList<Guest> guestList, int roomNumber){
        BedRoom bedroom = getBedRoom(roomNumber);
        bedroom.checkIn(guestList);
    }

    public BedRoom getBedRoom(int roomNumber){
        BedRoom bedroom = null;
        for (Room room : this.rooms){
            if (room instanceof BedRoom){
                bedroom = (BedRoom)room;
                if (bedroom.getRoomNumber() == roomNumber) {
                    return bedroom;
                }
            }
        }
        return bedroom;
    }

}