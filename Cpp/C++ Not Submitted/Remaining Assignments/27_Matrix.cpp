// 27. Write a program to accept and display 3 by 3 matrix.
//     Write Accept() and Display() functions to perform the tasks.
//     a. Find the transpose of a matrix and print the transpose using display() function.
//     b. Accept another matrix of same dimensions. Find the addition of two matrices and print the resultant matrix.

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

void matrixTranspose(int a[][SIZE], int t[][SIZE])
{
    for (int x = 0; x < SIZE; x++)
        for (int y = 0; y < SIZE; y++)
            t[y][x] = a[x][y];
}

void displayMatrix(int a[][SIZE])
{
    for (int x = 0; x < SIZE; x++)
    {
        for (int y = 0; y < SIZE; y++)
            cout << a[x][y] << " ";
        cout << endl;
    }
    cout<<endl;
}

void addMatrix(int a[][SIZE], int b[][SIZE], int sum[][SIZE]){
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            sum[i][j] = a[i][j] + b[i][j];
        }
        
    }
    
}

int main()
{
    int a[SIZE][SIZE], t[SIZE][SIZE], sum[SIZE][SIZE];

    cout << "\nEnter a" << endl;
    acceptMatrix(a);

    cout<<"\nEntered Matrix: "<<endl;
    displayMatrix(a);

    matrixTranspose(a, t);
    cout<<"\nTranspose of Entered Matrix: "<<endl;
    displayMatrix(t);
    cout<<endl;
    displayMatrix(a);
    cout<<"  +\n"<<endl;
    displayMatrix(t);
    cout<<"  =\n"<<endl;
    addMatrix(a,t,sum);

    displayMatrix(sum);

    return 0;
}