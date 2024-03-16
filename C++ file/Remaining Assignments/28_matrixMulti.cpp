// 28. Write a program which will calculate multiplication of two 3 by 3 matrices.

#include <iostream>
using namespace std;
#define SIZE 3

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