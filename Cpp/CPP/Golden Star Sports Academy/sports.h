#ifndef SPORTS_H
#define SPORTS_H
#include <string>
#include <vector>
using namespace std;
class Sports
{
private:
    string sports_name;
    double fees;
public:
    Sports(string, double);
    ~Sports();
    friend ostream& operator<<( ostream &, Sports &);
};

#endif