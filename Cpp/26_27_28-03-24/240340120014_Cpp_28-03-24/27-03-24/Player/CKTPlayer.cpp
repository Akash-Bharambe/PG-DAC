#include "CKTPlayer.h"
#include <iostream>
using namespace std;

CKTPlayer::CKTPlayer() : runs(0), wickets(0) {}
CKTPlayer::CKTPlayer(int runs, int wickets) : runs(runs), wickets(wickets) {}
CKTPlayer::CKTPlayer(string name, int age, int runs, int wickets) : Player::Player(name, age), runs(runs), wickets(wickets) {}

void CKTPlayer::accept()
{
    Player::accept();
    cout << "Enter Runs: ";
    cin >> runs;
    cout << "Enter Wickets: ";
    cin >> wickets;
}

void CKTPlayer::display()
{
    Player::display();
    cout << "Runs: " << runs << endl;
    cout << "Wickets: " << wickets << endl;
}

CKTPlayer::~CKTPlayer() {}