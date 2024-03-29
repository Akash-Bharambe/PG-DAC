#ifndef SHAPEHEAD_H
#define SHAPEHEAD_H

class Shape
{
public:
    virtual void accept() = 0;
    virtual float calcArea() = 0;
    virtual float calcPeri() = 0;
};

#endif