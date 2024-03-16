// 42. Write a class Employee for an application which will have data members for employee id, employee name and salary. Provide the following functionalities in Employee class.
// 1. Initialing objects using default and parameterized constructors.
// 2. Accepting and displaying the information of employee from console
// class Employee
// {

//     int emp_id;
//     char emp_name[20];
//     double salary;
//     public:
//     Employee();
//     Employee(int, char*, double);
//     void Accept();
//     void Display();
// };
// In "main" function declare an array of Employee objects. Write a menu driven program to -
// a. Insert record into an array.
// b. Update information of specific employee on the basis of emp_id accepted from user
// c. Display all records.

#include <iostream>
#include <string>
using namespace std;

class Employee
{
private:
    int emp_id;
    string emp_name;
    double salary;

public:
    Employee();
    Employee(int, char *, double);
    int getEmpId() const;
    void Accept();
    void Display();
};

Employee::Employee()
{
    this->emp_id = 0;
    this->emp_name = "";
    this->salary = 0;
}
Employee::Employee(int emp_id, char *emp_name, double salary)
{
    this->emp_id = emp_id;
    this->emp_name = emp_name;
    this->salary = salary;
}

int Employee::getEmpId() const
{
    return this->emp_id;
}
void Employee::Accept()
{
    cout << "Enter emp_name: ";
    cin.get();
    getline(cin, emp_name);
    cout << "Enter emp_id: ";
    cin >> emp_id;
    cout << "Enter salary:";
    cin >> salary;
}
void Employee::Display()
{
    cout << "\nemp_id: " << emp_id << " emp_name: " << emp_name << " salary: " << salary << endl;
}

int menulist()
{
    cout << "\n1. Insert record into an array.\n2. Update information of specific employee on the basis of emp_id accepted from user\n3. Display all records.\n0. Exit\nEnter Choice: ";
    int choice;
    cin >> choice;
    return choice;
}

int main()
{
    int choice, count = 0, change;
    Employee arr[3];
    while ((choice = menulist()) != 0)
    {
        switch (choice)
        {
        case 1:
            arr[count].Accept();
            count++;
            break;
        case 2:
            cout << "\nEnter emp_id of Employee to change Data: ";
            cin >> change;
            for (int i = 0; i < 3; i++)
                if (arr[i].getEmpId() == change)
                    arr[i].Accept();
            break;
        case 3:
            for (int i = 0; i < count; i++)
                arr[i].Display();
            break;
        default:
            break;
        }
    }

    return 0;
}