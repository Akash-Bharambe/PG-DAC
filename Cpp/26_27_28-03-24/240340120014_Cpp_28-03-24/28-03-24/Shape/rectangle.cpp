#include "rectangle.h"
#include <iostream>
using namespace std;
Rectangle::Rectangle() : length(1.1f), breadth(1.1f) {}

Rectangle::Rectangle(float length, float breadth) : length(length), breadth(breadth) {}

void Rectangle::accept()
{
    cout << "Enter Length: ";
    cin >> length;
    cout << "Enter Breadth: ";
    cin >> breadth;
}

float Rectangle::calcArea()
{
    return length * breadth;
}

float Rectangle::calcPeri()
{
    return 2 * (length + breadth);
}
