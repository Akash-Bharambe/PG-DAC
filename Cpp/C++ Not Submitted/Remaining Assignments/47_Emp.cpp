#include <iostream>
using namespace std;

class Employee
{
private:
    int emp_id;
    string name;
    string dob;

public:
    Employee() : emp_id(1), name("Akash"), dob("26-06-2002") {}
    Employee(int, string, string);
    virtual void calcSalary() = 0;
};

Employee::Employee(int emp_id, string name, string dob) : emp_id(emp_id), name(name), dob(dob) {}

class WageEmployee : public virtual Employee
{
private:
    int no_of_hours;
    int rate_per_hour;

public:
    WageEmployee(int, int);
    WageEmployee(int, string, string, int, int);
    int getHours();
    int getRate();
    void calcSalary();
};

WageEmployee::WageEmployee(int no_of_hours, int rate_per_hour) : no_of_hours(no_of_hours), rate_per_hour(rate_per_hour) {}

WageEmployee::WageEmployee(int emp_id, string name, string dob, int no_of_hours, int rate_per_hour) : no_of_hours(no_of_hours), rate_per_hour(rate_per_hour), Employee(emp_id, name, dob) {}

int WageEmployee::getHours()
{
    return this->no_of_hours;
}

int WageEmployee::getRate()
{
    return this->rate_per_hour;
}

void WageEmployee::calcSalary()
{
    cout << "Salary of WageEmployee: " << this->no_of_hours * this->rate_per_hour << endl;
}

class SalesPerson : public WageEmployee
{
private:
    int items_sold;
    int comission;

public:
    SalesPerson(int items_sold, int comission);
    SalesPerson(int, string, string, int, int, int, int);
    void calcSalary();
};

SalesPerson::SalesPerson(int items_sold, int comission) : items_sold(items_sold), comission(comission), WageEmployee(10, 10) {}

SalesPerson::SalesPerson(int emp_id, string name, string dob, int no_of_hours, int rate_per_hour, int items_sold, int comission) : items_sold(items_sold), comission(comission), WageEmployee(emp_id, name, dob, no_of_hours, rate_per_hour) {}

void SalesPerson::calcSalary()
{
    cout << "Salary of SalesPerson: " << (this->getRate() * this->getHours()) + (items_sold * comission) << endl;
}

class Manager : public virtual Employee
{
private:
    int salary;
    int subordinates;

public:
    Manager(int, int);
    Manager(int, string, string, int, int);
    int getSalary();
    ~Manager();
};

Manager::Manager(int salary, int subordinates) : salary(salary), subordinates(subordinates) {}

Manager::Manager(int emp_id, string name, string dob, int salary, int subordinates) : salary(salary), subordinates(subordinates), Employee(emp_id, name, dob)
{
}

int Manager::getSalary()
{
    return this->salary;
}

Manager::~Manager()
{
}

class SalesManager : public Manager, public SalesPerson
{

public:
    SalesManager(int, string, string, int, int, int, int);
    void calcSalary();
    ~SalesManager();
};

SalesManager::SalesManager(int emp_id, string name, string dob, int salary, int subordinates, int items_sold, int comission) : Manager(emp_id, name, dob, salary, subordinates), SalesPerson(items_sold, comission)
{
}

void SalesManager::calcSalary()
{
    cout << "Salary of SalesManager: " << this->getSalary();
}

SalesManager::~SalesManager()
{
}

int main()
{
    Employee *e1 = new WageEmployee(1, "Akash", "26-06-2002", 10, 10);
    e1->calcSalary();
    Employee *e2 = new SalesManager(1, "Akash", "26-06-2002", 103455, 10, 20, 15);
    e2->calcSalary();
    return 0;
}