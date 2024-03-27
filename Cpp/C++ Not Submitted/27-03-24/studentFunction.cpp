#include "studentHead.h"
#include <iostream>
using namespace std;

Student::Student() : name(""), roll(0) {}
Student::Student(string name, int roll) : name(name), roll(roll) {}
Student::Student(string name, int roll, int flatNumber, string area, string pinCode, string certiName, int certiNumber, string issuingAuth) : name(name), roll(roll), addr(flatNumber, area, pinCode), certi(certiName, certiNumber, issuingAuth) {}


void Student::accept()
{
    cout << "Enter Name of Student: ";
    getline(cin, name);
    cout << "Enter roll number: ";
    cin >> roll;
    addr.accept();
    certi.accept();
}
void Student::display()
{
    cout<<"----------------------------------------------------------------"<<endl;
    cout << "Name of Student: " << name << endl;
    cout << "Roll number: " << roll << endl;
    addr.display();
    certi.display();
}