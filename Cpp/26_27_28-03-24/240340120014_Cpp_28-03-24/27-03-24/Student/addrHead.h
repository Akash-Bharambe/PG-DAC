#ifndef ADDR_HEAD
#define ADDR_HEAD
#include <string>
using namespace std;

class Address
{
private:
    int flatNumber;
    string area;
    string pinCode;

public:
    Address();
    Address(int flatNumber, string area, string pinCode);
    void accept();
    void display();
    ~Address();
};

#endif