// 37. Overload function “Add” to add two integers, floats and doubles.

#include <iostream>
using namespace std;

int add(int a, int b)
{
    return a + b;
}
float add(float a, float b)
{
    return a + b;
}
double add(double a, double b)
{
    return a + b;
}

int main()
{
    int inta, intb;
    cout << "Enter Integers..." << endl;
    cout << "Enter a: ";
    cin >> inta;
    cout << "Enter b: ";
    cin >> intb;

    float floata, floatb;
    cout << "Enter Float..." << endl;
    cout << "Enter a: ";
    cin >> floata;
    cout << "Enter b: ";
    cin >> floatb;

    double doublea, doubleb;
    cout << "Enter Double..." << endl;
    cout << "Enter a: ";
    cin >> doublea;
    cout << "Enter b: ";
    cin >> doubleb;

    cout << "Sum of Integers \ta + b: " << add(inta, intb) << endl;
    cout << "Sum of Float \t\ta + b: " << add(floata, floatb) << endl;
    cout << "Sum of Double \t\ta + b: " << add(doublea, doubleb) << endl;

    return 0;
}