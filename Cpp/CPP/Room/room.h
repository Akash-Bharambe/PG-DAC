#ifndef ROOM_H
#define ROOM_H
#include<string>
using namespace std;
class Room
{
private:
    int room_id;
    string room_name;
    int seats;
    double pricePerSeat;

public:
    Room();
    Room(int, string, int, double);
    int getSeats();
    int getPrice();
    friend ostream &operator<<(ostream &, const Room &);
};
#endif