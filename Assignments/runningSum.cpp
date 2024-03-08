#include <iostream>
using namespace std;

int sum(int n)
{
    if (n == 1 || n == 0)
    {
        return 1;
    }

    int res = n + sum(n - 1);
    return res;
}

int main()
{
    int n;
    cout << "Enter value of n: ";
    cin >> n;

    int res = sum(n);
    cout << "Running Sum: " << res << endl;
    return 0;
}