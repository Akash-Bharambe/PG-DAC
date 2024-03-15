#include "headComplex.h"

int main()
{
    Complex c1(2, 3);
    Complex c2(5, -5);
    Complex c3 = c1 + c2;
    c3.displayData();
    return 0;
}
