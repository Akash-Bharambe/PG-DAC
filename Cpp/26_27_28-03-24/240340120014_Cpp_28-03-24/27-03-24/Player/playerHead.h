#ifndef PLAYER_HEAD
#define PLAYER_HEAD
#include <string>
using namespace std;

class Player
{
private:
    string name;
    int age;

public:
    Player();
    Player(string name, int age);
    void accept();
    void display();
    ~Player();
};

#endif