#include "student.h"
#include <iostream>
using namespace std;
Student::Student() : rollno(0), name("") {}
Student::Student(int rollno, char name[]) : rollno(rollno)
{
    for (int i = 0; i < 20; i++)
        this->name[i] = name[i];
}

void Student::accept()
{
    cout << "Enter name of Student: ";
    cin.getline(this->name, 20);
    cout << "Enter roll no: ";
    cin >> this->rollno;
}

void Student::display() const
{
    cout << "Name: " << name << endl;
    cout << "Roll No: " << rollno << endl;
}
