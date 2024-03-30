#include "cretificateHead.h"
#include <iostream>
using namespace std;

Certificate::Certificate() : certiName(""), certiNumber(0), issuingAuth("") {}
Certificate::Certificate(string certiName, int certiNumber, string issuingAuth) : certiName(certiName), certiNumber(certiNumber), issuingAuth(issuingAuth) {}
Certificate::~Certificate() {}

void Certificate::accept()
{
    cout << "Enter Certifiacte Name: ";
    getline(cin, certiName);
    cout << "Enter Certifiacte Number: ";
    cin >> certiNumber;
    cout << "Enter Certifiacte Issuing Authority: ";
    cin.get();
    getline(cin, issuingAuth);
}
void Certificate::display()
{
    cout << "Certifiacte Name: " << certiName << endl;
    cout << "Certifiacte Number: " << certiNumber << endl;
    cout << "Certifiacte Issuing Authority: " << issuingAuth << endl;
}
