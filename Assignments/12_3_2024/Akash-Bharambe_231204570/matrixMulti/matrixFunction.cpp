#include <iostream>
#include "matrixHead.h"
using namespace std;

void acceptMatrix(int a[][SIZE])
{
    for (int x = 0; x < SIZE; x++)
    {
        for (int y = 0; y < SIZE; y++)
        {
            cout << "Enter i" << x + 1 << " j" << y + 1 << ": ";
            cin >> a[x][y];
        }
    }
}

void matrixMultiply(int a[][SIZE], int b[][SIZE], int r[][SIZE])
{
    for (int x = 0; x < SIZE; x++)
    {
        for (int y = 0; y < SIZE; y++)
        {
            r[x][y] = 0;
            for (int z = 0; z < SIZE; z++)
            {
                r[x][y] += a[x][z] * b[z][y];
            }
        }
    }
}

void displayMatrix(int a[][SIZE])
{
    for (int x = 0; x < SIZE; x++)
    {
        for (int y = 0; y < SIZE; y++)
        {
            cout << "i" << x + 1 << " j" << y + 1 << ": " << a[x][y] << endl;
        }
    }
}