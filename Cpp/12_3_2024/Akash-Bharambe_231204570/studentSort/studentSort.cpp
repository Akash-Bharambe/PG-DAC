#include <iostream>
#include <string>
#include "studentHead.h"
using namespace std;

int main()
{
    Student Student[SIZE];
    int choice;
    while ((choice = menuList()) != 0)
    {
        switch (choice)
        {
        case 1:
            for (int i = 0; i < SIZE; i++)
                Student[i].acceptData();
            break;
        case 2:
            for (int i = 0; i < SIZE; i++)
                Student[i].displayData();
            break;
        case 3:
            sortRollNo(Student);
            break;
        case 4:
            sortMarks(Student);
            break;
        case 5:
            sortName(Student);
            break;
        default:
            cout << "Enter valid Choice" << endl;
            break;
        }
    }

    return 0;
}
