#ifndef CIRCLE_H
#define CIRCLE_H
#include "shape.h"

class Circle: public Shape
{
private:
    float radius;

public:
    Circle();
    Circle(float radius);
    virtual void accept();
    virtual float calcArea();
    virtual float calcPeri();
};

#endif