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
    void accept();
    float calcArea();
    float calcPeri();
};

#endif