public class HotelRooms {
    public static void main(String[] args) {

        Hotel[] roomsList = new Hotel[2];
        // pokój 1
        Hotel room1 = new Hotel();
        room1.roomNumber = 123;
        room1.floorNumber = 1;
        room1.roomStatus = 'W';
        roomsList[0] = room1;

        // pokój 2
        Hotel room2 = new Hotel();
        room2.roomNumber = 389;
        room2.floorNumber = 2;
        room2.roomStatus = 'Z';
        roomsList[1] = room2;

        for( Hotel room : roomsList){
            if(room.roomStatus == 'W'){
                System.out.println("Jest wolny pokój nr: " + room.roomNumber);
            }
            else {
                System.out.println("Jest zajęty pokój nr: "+ room.roomNumber);
            }
        }

    }
}

