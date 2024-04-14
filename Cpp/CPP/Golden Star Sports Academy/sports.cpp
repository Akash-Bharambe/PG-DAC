#include "sports.h"
#include <iostream>
using namespace std;
Sports::Sports(string sports_name, double fees) : sports_name(sports_name), fees(fees) {}

Sports::~Sports() {}

ostream &operator<<(ostream &os, Sports &s)
{
    os << s.sports_name << endl;
    return os;
}
