#include <iostream>
#include <string>
#include "empHead.h"
using namespace std;

int Employee::count = 0;

Employee::Employee()
{
    count++;
    this->empid = 0;
    this->name = "";
    this->salary = 0;
}
Employee::Employee(int empid, string name, unsigned int salary)
{
    count++;
    this->empid = empid;
    this->name = name;
    this->salary = salary;
}
Employee::~Employee() {}

void Employee::acceptData()
{
    cout << "\nEnter Name: ";
    cin >> this->name;
    cout << "Enter Employee Id: ";
    cin >> this->empid;
    cout << "Enter Salary: ";
    cin >> this->salary;
}
void Employee::displayData()
{
    cout << "\nEmployee id: " << this->empid << " Name: " << this->name << " Salary: " << salary << endl;
}
int menuList()
{
    cout << endl;
    cout << "1. Accept Data of an Employee" << endl;
    cout << "2. Display Data of all Employee" << endl;
    cout << "3. Display Count" << endl;
    cout << "4. Remove Employee" << endl;
    cout << "0. Exit" << endl;
    cout << "Enter Your Choice: ";
    int choice;
    cin >> choice;
    return choice;
}
int Employee::getCount()
{
    return count;
}
void Employee::removeEmployee()
{
    count--;
}