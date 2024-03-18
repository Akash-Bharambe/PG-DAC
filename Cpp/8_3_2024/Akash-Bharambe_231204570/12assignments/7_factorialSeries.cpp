#include <iostream>
using namespace std;

int fact(int n)
{
    if (n == 1)
        return 1;
    return n * fact(n - 1);
}

int main()
{
    int n;
    cout << "How many terms of factorial series is required: ";
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
            cout << fact(i) << " ";
    }

    return 0;
}