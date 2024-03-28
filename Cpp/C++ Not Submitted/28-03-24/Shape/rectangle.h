#ifndef RECTANGLE_H
#define RECTANGLE_H
#include "shape.h"

class Rectangle: public Shape
{
private:
    float length;
    float breadth;

public:
    Rectangle();
    Rectangle(float length, float breadth);
    virtual void accept();
    virtual float calcArea();
    virtual float calcPeri();
};

#endif