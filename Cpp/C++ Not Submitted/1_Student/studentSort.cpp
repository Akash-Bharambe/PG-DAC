#include <iostream>
#include <string>
#include "studentHead.h"
using namespace std;

int main()
{
    Student stud[SIZE];
    int choice;
    while ((choice = menuList()) != 0)
    {
        switch (choice)
        {
        case 1:
            for (int i = 0; i < SIZE; i++)
                stud[i].acceptData();
            break;
        case 2:
            cout << endl;
            for (int i = 0; i < SIZE; i++)
                stud[i].displayData();
            break;
        case 3:
            sortRollNo(stud);
            break;
        case 4:
            sortMarks(stud);
            break;
        case 5:
            sortName(stud);
            break;
        case 6:
            findStudent(stud);
        default:
            cout << "Enter valid Choice" << endl;
            break;
        }
    }

    return 0;
}
