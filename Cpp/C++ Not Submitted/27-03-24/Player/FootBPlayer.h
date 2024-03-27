#ifndef FOOTBPLAYER_HEAD
#define FOOTBPLAYER_HEAD
#include "playerHead.h"
using namespace std;

class FOOTBPlayer : public Player
{
private:
    int goals;

public:
    FOOTBPlayer();
    FOOTBPlayer(int goals);
    FOOTBPlayer(string name, int age, int goals);
    void accept();
    void display();
    ~FOOTBPlayer();
};

#endif