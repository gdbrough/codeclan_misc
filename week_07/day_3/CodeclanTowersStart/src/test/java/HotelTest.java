import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom singleRoom;
    BedRoom doubleRoom;
    BedRoom suite;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){
        singleRoom = new BedRoom(RoomType.SINGLE, 25.00, 101);
        doubleRoom  = new BedRoom(RoomType.DOUBLE, 50.00, 201);
        suite  = new BedRoom(RoomType.SUITE, 100.00, 301);
        conferenceRoom = new ConferenceRoom(100, "Conference Room B", 200);
        diningRoom = new DiningRoom(50, "The Ritz");
        guest = new Guest("Sybil Fawlty");
        ArrayList<Room> testRooms = new ArrayList<>();
        testRooms.add(singleRoom);
        testRooms.add(doubleRoom);
        testRooms.add(suite);
        testRooms.add(conferenceRoom);
        testRooms.add(diningRoom);
        hotel = new Hotel(testRooms);
    }

    @Test
    public void testCanCheckInToSingleRoom() {
        ArrayList<Guest> testGuests = new ArrayList<>();
        testGuests.add(guest);
        hotel.checkInToBedroom(testGuests, 101);
        BedRoom room = hotel.getBedRoom(101);
        assertEquals(1, room.getCheckedInGuestCount());
    }
}
