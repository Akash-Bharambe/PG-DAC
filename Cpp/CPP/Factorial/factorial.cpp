#include <iostream>
#include <fstream>
#include <stdexcept>
using namespace std;

int factorial(int n)
{
    if (n == 1 || n == 0)
    {
        return 1;
    }
    return n * factorial(n - 1);
}

int main()
{
    int arr[10];
    cout << "Enter 10 numbers";
    for (int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
    {
        cin >> arr[i];
    }

    ofstream fout("fact.txt", ios::out);

    if (!fout)
    {
        cerr << "Cannot Open File";
        return 1;
    }
    for (int i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
    {
        fout << arr[i] << ", " << factorial(arr[i]) << endl;
    }
    fout.close();

    return 0;
}