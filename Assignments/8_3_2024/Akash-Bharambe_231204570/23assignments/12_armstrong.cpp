#include <iostream>
using namespace std;

int main()
{
    int a;
    cout << "Enter number: ";
    cin >> a;
    int terms = 0, sum = 0, arr[10];
    int og = a;
    while (a > 0)
    {
        a /= 10;
        terms++;
    }
    a = og;

    while (a > 0)
    {
        int digit = a % 10;
        int product = 1;
        for (int i = 0; i < terms; i++)
        {
            product *= digit;
        }
        sum += product;
        a /= 10;
    }
    if (sum == og)
    {
        cout << og << " is armstrong number";
    }
    else
        cout << og << " is not armstrong number";
    return 0;
}