#include <iostream>
#include <string>
#include "student.h"
using namespace std;

Student::Student()
{
    rollno = 0;
    marks = 0;
    name = "";
}
Student::Student(int rollno, int marks, string name)
{
    this->rollno = rollno;
    this->marks = marks;
    this->name = name;
}

int Student::getRollno()
{
    return rollno;
}

int Student::getMarks()
{
    return marks;
}

string Student::getName()
{
    return name;
}

void Student::accept()
{
    cout << "enter the roll no:" << endl;
    cin >> rollno;
    cout << "enter the name" << endl;
    cin.get();
    getline(cin, name);
    cout << "enter the marks" << endl;
    cin >> marks;
}

void Student::display()
{
    cout << "the rool no:" << rollno << " and name is" << name << " and marks got :" << marks << endl;
}

void sortRollno(Student student[], int size)
{
    Student temp;
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (student[i].getRollno() > student[j].getRollno())
            {
                temp = student[j];
                student[j] = student[i];
                student[i] = temp;
            }
        }
    }
}

void sortMarks(Student student[], int size)
{
    Student temp;
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (student[i].getMarks() > student[j].getMarks())
            {
                temp = student[j];
                student[j] = student[i];
                student[i] = temp;
            }
        }
    }
}

void sortName(Student student[], int size)
{
    Student temp;
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (student[j].getName() < student[i].getName())
            {
                temp = student[j];
                student[j] = student[i];
                student[i] = temp;
            }
        }
    }
}

istream &operator>>(istream &is, Student &s)
{
    cout << "Enter Roll No: ";
    is >> s.rollno;
    cout << "Enter Marks: ";
    is >> s.marks;
    cout << "Enter Name: ";
    is >> s.name;
    return is;
}

ostream &operator<<(ostream &os, Student &s)
{
    return os << "Roll no: " << s.rollno << " Marks: " << s.marks << " Name: " << s.name << endl;
}
