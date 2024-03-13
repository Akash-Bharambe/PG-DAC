#include <iostream>
#include <string>
#include "empHead.h"
using namespace std;

int main()
{
    Employee *earr[10] = {nullptr};
    // for (int i = 0; i < Employee::getCount(); i++)
    //     earr[i].acceptData();

    // cout << Employee::getCount()<<endl;
    // for (int i = 0; i < Employee::getCount(); i++)
    //     earr[i].displayData();

    int choice;
    while ((choice = menuList()) != 0)
    {
        switch (choice)
        {
        case 1:
            if (Employee::getCount() < 10)
            {
                earr[Employee::getCount()] = new Employee;
                cout << "\nNo of Employees: " << Employee::getCount() << endl;
                earr[Employee::getCount() - 1]->acceptData();
            }
            break;
        case 2:
            for (int i = 0; i < Employee::getCount(); i++)
            {
                if (earr[i] != nullptr)
                    earr[i]->displayData();
            }
            break;
        case 3:
            cout << "\nNo of Employees: " << Employee::getCount() << endl;
            break;
        case 4:
            delete earr[Employee::getCount() - 1];
            earr[Employee::getCount() - 1] = nullptr;
            Employee::removeEmployee();
            break;
        default:
            cout << "\nEnter valid Choice" << endl;
            break;
        }
    }
    for (int i = 0; i < 10; ++i)
    {
        delete earr[i];
    }
    return 0;
}