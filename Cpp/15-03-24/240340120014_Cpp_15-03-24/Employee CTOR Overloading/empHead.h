#include <string>
using namespace std;

class Employee
{
private:
    int empid;
    string name;
    unsigned int salary;
    static int count;

public:
    Employee();
    Employee(int, string, int);
    explicit Employee(const Employee &that);
    static int getCount();
    void acceptData();
    void displayData();
};
