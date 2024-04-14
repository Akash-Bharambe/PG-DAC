#ifndef UTILS_H
#define UTILS_H
#include "player.h"
#include "sports.h"
int menuList();
Player addNewPlayer();
Sports addNewSport();
int enrollPlayer(vector<Player>);
void playerData(vector<Player>);
void displayAllPlayers(vector<Player> players);
#endif