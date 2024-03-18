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
    Employee(int, string, unsigned int);
    static int getCount();
    void acceptData();
    void displayData();
};
