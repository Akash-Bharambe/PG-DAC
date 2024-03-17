#include <iostream>
using namespace std;

int main()
{
    int matchsticks = 21;
    int player, computer;

    cout << "Matchsticks Game" << endl;

    while (matchsticks > 1)
    {
        cout << "Matchsticks Left: " << matchsticks << endl;
        cout << "Pick 1, 2, 3, 4 Matchsticks: ";
        cin >> player;

        while (player < 1 || player > 4)
        {
            cout << "Invalid Choice" << endl;
            cout << "Pick 1, 2, 3, 4 Matchsticks: ";
            cin >> player;
        }
        matchsticks -= player;
        if (matchsticks <= 1)
        {
            cout << "You Lose PC Wins" << endl;
            break;
        }

        computer = (matchsticks - 1) % 5;
        if (computer == 0)
            computer = 1;
        cout << "PC Picks " << computer << " matchsticks." << endl;
        matchsticks -= computer;
        
        if (matchsticks <= 1)
        {
            cout << "You Win PC Lose";
            break;
        }
    }

    return 0;
}