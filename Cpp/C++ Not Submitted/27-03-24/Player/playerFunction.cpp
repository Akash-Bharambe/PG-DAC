#include "playerHead.h"
#include <iostream>
using namespace std;

Player::Player() : name(""), age(0) {}
Player::Player(string name, int age) : name(name), age(age) {}
Player::~Player() {}

void Player::accept()
{
    cout << "Enter age of Player: ";
    cin >> age;
    cout << "Enter name of Player: ";
    cin.get();
    getline(cin, name);
}

void Player::display()
{
    cout << "Name of Player: " << name << endl;
    cout << "Age: " << age << endl;
}
