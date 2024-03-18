#include <iostream>
#include "matrixHead.h"
using namespace std;

int main()
{
    int a[SIZE][SIZE], b[SIZE][SIZE], r[SIZE][SIZE];

    cout << "\nEnter a" << endl;
    acceptMatrix(a);

    cout << "\nEnter b" << endl;
    acceptMatrix(b);

    matrixMultiply(a, b, r);

    displayMatrix(r);

    return 0;
}