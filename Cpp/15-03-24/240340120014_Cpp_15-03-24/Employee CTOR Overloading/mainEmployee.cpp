#include <iostream>
#include "empHead.h"
using namespace std;

int main()
{
    Employee e1;
    e1.acceptData();
    cout<<"e1: ";
    e1.displayData();
    Employee e2(e1);
    cout<<"e2: ";
    e2.displayData();
    return 0;
}
