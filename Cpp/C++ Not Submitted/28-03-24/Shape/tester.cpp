#include "rectangle.h"
#include "circle.h"
#include <iostream>
using namespace std;
int main()
{
    Shape *s = nullptr;
    Rectangle r;
    Circle c;
    s = &r;
    s->accept();
    cout << "Area of Rectangle: " << s->calcArea() << endl;
    cout << "Perimeter of Rectangle: " << s->calcPeri() << endl;

    s = &c;
    s->accept();
    cout << "Area of Circle: " << s->calcArea() << endl;
    cout << "Perimeter of Circle: " << s->calcPeri() << endl;

    return 0;
}
