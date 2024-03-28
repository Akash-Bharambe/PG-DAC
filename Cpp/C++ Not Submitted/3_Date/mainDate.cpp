#include "date.h"
#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    Date d(26, 6, 2002);
    Date d1(28, 3, 2024);
    cout << "Days: " << d.diffDate(d1);

    return 0;
}
