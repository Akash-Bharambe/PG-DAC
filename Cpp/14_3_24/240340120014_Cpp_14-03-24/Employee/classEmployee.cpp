#include <iostream>
#include "empHead.h"
using namespace std;

Employee::Employee()
{
    this->empid = 0;
    this->name = "";
    this->salary = 0;
}
Employee::Employee(int empid, string name, int salary)
{
    this->empid = empid;
    this->name = name;
    this->salary = salary;
}
Employee::~Employee() {}

void Employee::acceptData()
{
    cout << "\nEnter Name: ";
    cin >> name;
    cout << "Enter Employee Id: ";
    cin >> this->empid;
    cout << "Enter Salary: ";
    cin >> this->salary;
}
void Employee::displayData()
{
    cout << "\nEmployee id: " << this->empid << " Name: " << this->name << " Salary: " << salary << endl;
}
int Employee::getSalary(){
    return this->salary;
}
