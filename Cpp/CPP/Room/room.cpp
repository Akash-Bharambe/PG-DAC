#include <iostream>
#include"room.h"
using namespace std;



Room::Room() : room_id(1), room_name("room1"), seats(10), pricePerSeat(100) {}

Room::Room(int room_id, string room_name, int seats, double pricePerSeat) : room_id(room_id), room_name(room_name), seats(seats), pricePerSeat(pricePerSeat) {}

int Room::getSeats()
{
    return this->seats;
}

int Room::getPrice()
{
    return this->pricePerSeat;
}

ostream &operator<<(ostream &os, const Room &r)
{
    os << "Room ID: " << r.room_id << "  Room Name: " << r.room_name << " No of Seats: " << r.seats << " Price Per Seat: " << r.pricePerSeat << endl;
    return os;
}
