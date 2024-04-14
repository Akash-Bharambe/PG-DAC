#include "player.h"
#include "sports.h"
#include "utils.h"
#include <iostream>
using namespace std;

int main()
{
    int ch;
    vector<Player> players;
    vector<Sports> sports;
    while ((ch = menuList()) != 0)
    {
        try
        {
            switch (ch)
            {
            case 1:
                players.push_back(addNewPlayer());
                break;
            case 2:
                sports.push_back(addNewSport());
                break;
            case 3:
                if (sports.capacity() == 0)
                {
                    cout << "\nPlease Add Sports First..." << endl;
                }
                else
                {
                    players[enrollPlayer(players)].enrollSport(sports);
                }
                break;
            case 4:
                if (players.capacity() == 0)
                {
                    cout << "\nPlease Add Players First..." << endl;
                }
                else
                {
                    playerData(players);
                }
                break;
            case 5:
                if (players.capacity() == 0)
                {
                    cout << "\nPlease Add Players First..." << endl;
                }
                else
                {
                    displayAllPlayers(players);
                }
                break;

            default:
                cout << "Enter Valid Input...!!!" << endl;
                break;
            }
        }
        catch (const std::exception &e)
        {
            std::cerr << e.what() << '\n';
        }
    }

    return 0;
}
