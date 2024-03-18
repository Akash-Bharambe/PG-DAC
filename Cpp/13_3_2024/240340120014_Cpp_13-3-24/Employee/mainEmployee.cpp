#include <iostream>
#include <string>
#include "empHead.h"
using namespace std;

int main()
{
    Employee earr[3];
    for (int i = 0; i < Employee::getCount(); i++)
        earr[i].acceptData();

    cout << Employee::getCount()<<endl;
    for (int i = 0; i < Employee::getCount(); i++)
        earr[i].displayData();
    cout<<"Number of Employee: "<<Employee::getCount();
    return 0;
}
