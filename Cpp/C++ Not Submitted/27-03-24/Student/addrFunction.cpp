#include "addrHead.h"
#include <iostream>
using namespace std;

Address::Address() : flatNumber(0), area(""), pinCode("") {}
Address::Address(int flatNumber, string area, string pinCode) : flatNumber(flatNumber), area(area), pinCode(pinCode) {}
Address::~Address() {}
void Address::accept()
{
    cout << "Enter Flat Number: ";
    cin >> flatNumber;
    cout << "Enter Area: ";
    cin.get();
    getline(cin, area);
    cout << "Enter PinCode: ";
    getline(cin, pinCode);
}
void Address::display()
{
    cout << "Flat Number: " << flatNumber << endl;
    cout << "Area: " << area << endl;
    cout << "PinCode: " << pinCode << endl;
}