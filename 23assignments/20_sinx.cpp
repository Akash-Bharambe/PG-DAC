#include <iostream>
using namespace std;

#define M_PI 3.142

double factorial(int n)
{
    if (n == 0)
        return 1;
    double result = 1;
    for (int i = 1; i <= n; ++i)
    {
        result *= i;
    }
    return result;
}

double power(double m, int n)
{
    double res = 1;
    for (int i = 0; i < n; i++)
        res *= m;
    return res;
}

int main()
{
    double x, result = 0;
    cout << "To calculate sin(x) enter the value of x in Degrees: ";
    cin >> x;
    x *= M_PI / 180.0;
    for (int i = 1; i <= 5; i++)
    {
        if (i % 2 == 0)
            result -= power(x, 2 * i - 1) / factorial(2 * i - 1);
        result += power(x, 2 * i - 1) / factorial(2 * i - 1);
    }
    cout << "sin(x) = " << result;
    return 0;
}