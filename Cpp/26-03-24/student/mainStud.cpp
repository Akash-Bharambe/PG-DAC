#include <iostream>
#include <string>
#include "student.h"
using namespace std;
int main()
{
    Student s1[3];
    for (int i = 0; i < 3; i++)
    {
        cin >> s1[i];
    }
    for (int i = 0; i < 3; i++)
    {
        cout << s1[i];
    }
    sortName(s1, 3);
    for (int i = 0; i < 3; i++)
    {
        cout << s1[i];
    }
}