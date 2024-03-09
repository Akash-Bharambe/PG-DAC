#include <iostream>
using namespace std;

int main()
{
    int bs, hra, da, pf, grossSalary, netSalary;
    cout << "Enter Basic Salary: ";
    cin >> bs;
    hra = (15 * bs) / 100;
    da = (30 * bs) / 100;
    pf = (12.5 * bs) / 100;
    grossSalary = bs + hra + da;
    netSalary = grossSalary - pf;

    cout << "Gross Salary: " << grossSalary << endl;
    cout << "Net Salary: " << netSalary << endl;
    return 0;
}