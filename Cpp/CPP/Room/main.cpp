#include <iostream>
#include "room.h"
using namespace std;

int calcPrice(int noOfStudents, Room &r)
{
    return noOfStudents * r.getPrice();
}

int main()
{
    Room roomArr[] = {Room(), Room(2, "room2", 20, 200), Room(3, "room3", 30, 300), Room(4, "room4", 40, 400), Room(5, "room5", 50, 500), Room(6, "room6", 60, 600), Room(7, "room7", 70, 700), Room(8, "room8", 80, 800), Room(9, "room9", 90, 900), Room(10, "room10", 100, 1000)};

    cout << "Enter Number Of Students: ";
    int noOfStudents;
    cin >> noOfStudents;

    for (int i = 0; i < sizeof(roomArr) / sizeof(roomArr[0]); i++)
    {
        if (roomArr[i].getSeats() >= noOfStudents)
        {
            cout << roomArr[i] <<"Total Price: "<< calcPrice(noOfStudents, roomArr[i])<<endl;
        }
    }
    return 0;
}