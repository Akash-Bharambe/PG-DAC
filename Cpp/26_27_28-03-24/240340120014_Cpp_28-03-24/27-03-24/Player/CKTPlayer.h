#ifndef CKTPLAYER_HEAD
#define CKTPLAYER_HEAD
#include "playerHead.h"
using namespace std;

class CKTPlayer : public Player
{
private:
    int runs;
    int wickets;

public:
    CKTPlayer();
    CKTPlayer(int runs, int wickets);
    CKTPlayer(string name, int age, int runs, int wickets);
    void accept();
    void display();
    ~CKTPlayer();
};

#endif