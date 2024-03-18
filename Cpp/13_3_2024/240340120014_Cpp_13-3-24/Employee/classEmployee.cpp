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

int Employee::getCount()
{
    return count;
}
