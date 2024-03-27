#include "FootBPlayer.h"
#include <iostream>
using namespace std;

FOOTBPlayer::FOOTBPlayer() : goals(0) {}
FOOTBPlayer::FOOTBPlayer(int goals) : goals(goals) {}
FOOTBPlayer::FOOTBPlayer(string name, int age, int goals) : Player::Player(name, age), goals(goals) {}

void FOOTBPlayer::accept()
{
    Player::accept();
    cout << "Enter Goals: ";
    cin >> goals;
}

void FOOTBPlayer::display()
{
    Player::display();
    cout << "Goals: " << goals << endl;
}

FOOTBPlayer::~FOOTBPlayer()
{
}
