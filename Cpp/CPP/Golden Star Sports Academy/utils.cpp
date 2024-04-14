#include "utils.h"
#include <iostream>
using namespace std;
int menuList()
{
    cout << "\n0. EXIT" << endl;
    cout << "1. Add New Player" << endl;
    cout << "2. Add new Sport" << endl;
    cout << "3. Enroll Player into Sport" << endl;
    cout << "4. Player Data" << endl;
    cout << "5. Display all players and their Sports registered" << endl;
    cout << "Enter Choice: ";
    int ch;
    cin >> ch;
    return ch;
}

Player addNewPlayer()
{
    string name;
    int age;
    int id;
    long long int mobileNumber;
    cout << "\nEnter Player Name: ";
    cin.get();
    getline(cin, name);
    cout << "Enter Player AGE: ";
    cin >> age;
    cout << "Enter Player ID: ";
    cin >> id;
    cout << "Enter Player Mobile Number: ";
    cin >> mobileNumber;
    return Player(name, age, id, mobileNumber);
}

Sports addNewSport()
{
    string sports_name;
    double fees;

    cout << "Enter Sport Name: ";
    cin >> sports_name;
    cout << "Enter Fees: ";
    cin >> fees;
    return Sports(sports_name, fees);
}

int enrollPlayer(vector<Player> players)
{
    cout << "\nSelect Player to be Enrolled: "<<endl;
    for (int i = 0; i < players.capacity(); i++)
    {
        cout << i+1 << ". " << players[i]<<endl;
    }
    int index;
    cin >> index;
    return index-1;
}

void playerData(vector<Player> players)
{
    cout << "Enter Player Name: ";
    string name;
    cin.get();
    getline(cin, name);
    for (int i = 0; i < players.capacity(); i++)
    {
        if (players[i].getName() == name)
        {
            cout << players[i];
            players[i].displaySports();
            break;
        }
    }
}

void displayAllPlayers(vector<Player> players)
{
    for (int i = 0; i < players.capacity(); i++)
    {
        cout<<players[i]<<endl;
        players[i].displaySports();
    }
    
}
