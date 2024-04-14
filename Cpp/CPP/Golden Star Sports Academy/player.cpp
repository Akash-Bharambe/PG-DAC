#include "player.h"
#include <iostream>

Player::Player(string name, int age, int id, long long int mobileNumber) : Person(name, age), id(id), mobileNumber(mobileNumber) {}

void Player::enrollSport(vector<Sports> sports)
{
    cout<<"Which Sport to Enroll for..."<<endl;
    for (int i = 0; i < sports.capacity(); i++)
    {
        cout<<i+1<<". "<<sports[i];
    }
    int ch;
    cin>>ch;
    for (int i = 0; i < sports.capacity(); i++)
    {
        if (sports[i] == sports[ch-1])
        {
            /* code */
        }
        
    }
    
    
    sportsList.push_back(sports[ch-1]);
}

void Player::displaySports()
{
    for(Sports s : sportsList){
        cout<< s;
    }
}

Player::~Player() {}

ostream &operator<<(ostream &os, Player &p)
{
    os << "Name: " << p.getName() << " Age: " << p.getAge() << " ID: " << p.id << " Mobile Number " << p.mobileNumber;
    return os;
}
