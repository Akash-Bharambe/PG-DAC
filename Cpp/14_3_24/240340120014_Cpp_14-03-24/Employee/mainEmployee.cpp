#include <iostream>
#include "utils.h"
using namespace std;

int main()
{
    Employee arr[5];

    for (int i = 0; i < 5; i++)
        arr[i].acceptData();
    for (int i = 0; i < 5; i++)
        arr[i].displayData();
    sortSalary(arr, 5);
    cout<<"Sorted According to Salary: "<<endl;
    for (int i = 0; i < 5; i++)
        arr[i].displayData();
    return 0;
}