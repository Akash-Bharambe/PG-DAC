#ifndef EMPHEAD_H
#define EMPHEAD_H
#include <string>
using namespace std;

class Employee
{
private:
    int empid;
    string name;
    int salary;

public:
    Employee();
    Employee(int, string, int);
    void acceptData();
    void displayData();
    int getSalary();
    ~Employee();
};
#endif