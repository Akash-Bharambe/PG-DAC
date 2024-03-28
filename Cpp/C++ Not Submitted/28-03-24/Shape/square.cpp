#include "square.h"
#include <iostream>
using namespace std;
Square::Square() : side(1) {}
Square::Square(float side) : side(side) {}
void Square::accept()
{
    cout << "Enter the Side: ";
    cin >> side;
}
float Square::calcArea()
{
    return side * side;
}
float Square::calcPeri()
{
    return 4 * side;
}
