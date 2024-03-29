#include "circle.h"
#include<cmath>
#include<iostream>
using namespace std;

Circle::Circle(): radius(1.1f) {}

Circle::Circle(float length): radius(radius) {}

void Circle::accept()
{
    cout << "Enter Radius: ";
    cin >> radius;
}

float Circle::calcArea()
{
    return M_PI * radius * radius;
}

float Circle::calcPeri()
{
    return 2 * M_PI * radius;
}
