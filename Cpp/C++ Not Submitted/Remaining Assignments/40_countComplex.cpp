// 40. Write a program to count number of objects created for above class Complex . Use static data member and member function.

#include <iostream>
using namespace std;

class Complex
{
private:
    int real;
    int imag;
    static int count;

public:
    Complex();
    Complex(int, int);
    void displayData() const;
    int getReal() const;
    int getImag() const;
    void setReal(int real);
    void setImag(int imag);
    static int getCount();
};

int Complex::count = 0;

Complex::Complex()
{
    count++;
    this->real = 0;
    this->imag = 0;
}

Complex::Complex(int real, int imag)
{
    count++;
    this->real = real;
    this->imag = imag;
}

void Complex::displayData() const
{
    char ch = (this->imag >= 0) ? '+' : '-';
    cout << real << " " << ch << " i" << abs(imag) << endl;
}

int Complex::getReal() const
{
    return this->real;
}
int Complex::getImag() const
{
    return this->imag;
}
void Complex::setReal(int real)
{
    this->real = real;
}
void Complex::setImag(int imag)
{
    this->imag = imag;
}

int Complex::getCount()
{
    return count;
}

int main()
{
    Complex c1(2, 3);
    Complex c2(5, -5);
    c1.displayData();
    c2.displayData();

    cout << "No. of Objects of Complex Class: " << Complex::getCount() << endl;
    return 0;
}