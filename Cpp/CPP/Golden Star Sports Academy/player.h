#ifndef PLAYER_H
#define PLAYER_H

#include "person.h"
#include <vector>
#include "sports.h"

class Player : public Person
{
private:
    int id;
    long long int mobileNumber;
    vector<Sports> sportsList;
    friend ostream &operator<<(ostream &, Player &);

public:
    Player(string, int, int, long long int);
    void enrollSport(vector<Sports> );
    void displaySports();
    ~Player();
};

#endif