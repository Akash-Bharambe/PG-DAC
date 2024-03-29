#ifndef SQUARE_H
#define SQUARE_H
#include "shape.h"

class Square : public Shape
{
private:
    float side;

public:
    Square();
    Square(float);
    void accept();
    float calcArea();
    float calcPeri();
};

#endif