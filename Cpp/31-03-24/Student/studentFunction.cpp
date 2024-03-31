#include "studentHead.h"
#include <iostream>
using namespace std;

Student::Student() : name(""), roll(0) {}
Student::Student(string name, int roll) : name(name), roll(roll) {}

void Student::accept()
{
    cout << "Enter Name of Student: ";
    cin.get();
    getline(cin, name);
    cout << "Enter roll number: ";
    cin >> roll;
}

int menulist()
{
    int ch;
    cout << "1. Add Student" << endl;
    cout << "2. Display Student" << endl;
    cout << "3. Search Student" << endl;
    cout << "4. Sort Students Based on Roll Number" << endl;
    cout << "5. Edit Name of Student" << endl;
    cout << "0. Exit" << endl;
    cout << "Enter Choice: ";
    cin >> ch;
    return ch;
}

void Student::display()
{
    cout << "----------------------------------------------------------------" << endl;
    cout << "Name of Student: " << name << endl;
    cout << "Roll number: " << roll << endl;
    cout << "----------------------------------------------------------------" << endl;
}

void acceptStudent(vector<Student> &vStudent)
{
    Student s;
    s.accept();
    vStudent.push_back(s);
}

void displayStudents(vector<Student> &vStudent)
{
    vector<Student>::iterator iter = vStudent.begin();

    while (iter != vStudent.end())
    {
        iter->display();
        iter++;
    }
}

int Student::getRoll()
{
    return this->roll;
}
void Student::setName(string name)
{
    this->name = name;
}

void renameStudent(vector<Student> &vStudent)
{
    int roll;
    cout << "Enter Roll Number to Search: ";
    cin >> roll;
    vector<Student>::iterator iter = vStudent.begin();

    while (iter != vStudent.end())
    {
        if (iter->getRoll() == roll)
        {
            string name;
            iter->display();
            cout << "Enter New Name: ";
            cin.get();
            getline(cin, name);
            iter->setName(name);
            return;
        }
        else
        {
            cout << "Student NOT FOUND" << endl;
            return;
        }
        iter++;
    }
}

void findStudent(vector<Student> &vStudent)
{
    int roll;
    cout << "Enter Roll Number to Search: ";
    cin >> roll;
    vector<Student>::iterator iter = vStudent.begin();
    while (iter != vStudent.end())
    {
        if (iter->getRoll() == roll)
        {
            iter->display();
            return;
        }
        else
        {
            cout << "Student NOT FOUND" << endl;
            return;
        }
        iter++;
    }
}

void sortStudent(vector<Student> &vStudent)
{
    for (vector<Student>::iterator i = vStudent.begin(); i != vStudent.end(); i++)
        for (vector<Student>::iterator j = i + 1; j != vStudent.end(); j++)
            if (i->getRoll() > j->getRoll())
                swap(*i, *j);
}
