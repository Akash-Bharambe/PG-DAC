#include <iostream>
#ifndef HEADCOMPLEX_H
#define HEADCOMPLEX_H
class Complex
{
private:
    int real;
    int imag;

public:
    Complex(int = 0, int = 0);
    void acceptData();
    void displayData() const;
    Complex operator+(const Complex &that) const;
    Complex operator-(const Complex &that) const;
};
#endif