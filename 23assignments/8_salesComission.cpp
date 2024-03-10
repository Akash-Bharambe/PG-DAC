#include <iostream>
using namespace std;

int main()
{
    int basic, sales, netSalary;
    cout << "Enter basic Salary: ";
    cin >> basic;
    cout << "Enter Total Sales Amount: ";
    cin >> sales;

    if (sales >= 5000 || sales <= 7500)
        netSalary = basic + ((3 * sales) / 100);
    else if (sales >= 7501 || sales <= 10500)
        netSalary = basic + ((8 * sales) / 100);
    else if (sales >= 10501 || sales <= 15000)
        netSalary = basic + ((11 * sales) / 100);
    else if (sales >= 15000)
        netSalary = basic + ((15 * sales) / 100);
    cout<<"Net Salary: "<<netSalary;
    return 0;
}