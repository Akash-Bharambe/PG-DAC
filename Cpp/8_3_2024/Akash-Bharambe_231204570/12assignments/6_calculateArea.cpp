#include <iostream>
#include <cmath>
using namespace std;

int menulist()
{
    int i;
    cout << "\n1. Calculate Area of Circle" << endl;
    cout << "2. Calculate Area of Rectangle" << endl;
    cout << "3. Calculate Area of Square" << endl;
    cout << "0. Exit" << endl;
    cout << "Enter Your Choice: ";
    cin >> i;
    return i;
}

void circle()
{
    int radius;
    cout << "Enter Radius of Circle: ";
    cin >> radius;

    cout << "Area of circle: " << M_PI * radius * radius << endl;
}

void rect()
{
    int length;
    cout << "Enter length of rectangle: ";
    cin >> length;
    int breadth;
    cout << "Enter breadth of rectangle: ";
    cin >> breadth;

    cout << "Area of Rectangle: " << length * breadth << endl;
}
void square()
{
    int side;
    cout << "Enter side of Square: ";
    cin >> side;
    cout << "Area of Square: " << side * side << endl;
}

int main()
{
    int i;
    do
    {
        switch (i = menulist())
        {
        case 1:
            circle();
            break;
        case 2:
            rect();
            break;
        case 3:
            square();
            break;
        default:
            break;
        }
    } while (i != 0);

    return 0;
}