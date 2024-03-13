#include <iostream>
#include <string>
#include "studentHead.h"
using namespace std;

Student::Student()
{
    this->rollNo = 0;
    this->name = "";
    this->marks = 0;
}
Student::Student(int rollNo, string name, int marks)
{
    this->rollNo = rollNo;
    this->name = name;
    this->marks = marks;
}
int Student::getRollNo()
{
    return this->rollNo;
}
string Student::getName()
{
    return this->name;
}
int Student::getMarks()
{
    return this->marks;
}
Student::~Student() {}

void Student::acceptData()
{
    cout << "Enter roll number: ";
    cin >> this->rollNo;
    cout << "Enter Name: ";
    cin >> this->name;
    cout << "Enter marks: ";
    cin >> this->marks;
}
void Student::displayData()
{
    cout << "Roll No: " << this->rollNo << " Name: " << this->name << " Marks: " << marks << endl;
}
void sortRollNo(Student arr[])
{
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            if (arr[i].getRollNo() < arr[j].getRollNo())
            {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
}

void sortName(Student arr[])
{
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            if (arr[i].getName() < arr[j].getName())
            {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
}

void sortMarks(Student arr[])
{
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            if (arr[i].getMarks() < arr[j].getMarks())
            {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
}
void swap(Student a, Student b)
{
    Student temp = a;
    a = b;
    b = temp;
}
int menuList()
{
    cout << "1. Accept Data of all Students" << endl;
    cout << "2. Display Data of all Students" << endl;
    cout << "3. Sort by Roll Number" << endl;
    cout << "4. Sort by marks" << endl;
    cout << "5. Sort by Name" << endl;
    cout << "0. Exit" << endl;
    cout << "Enter Your Choice: ";
    int choice;
    cin >> choice;
    return choice;
}
