#include <iostream>
using namespace std;

int main()
{
    // for (int i = 6; i > 1; i--)
    // {
    //     for (int j = 1; j < i; j++)
    //     {
    //         cout << j;
    //     }
    //     for (int k = i; k < 8; k++)
    //     {
    //         cout << "*";
    //     }

    //     cout << endl;
    // }
    int n = 5;
    for (int i = n; i > 0; i--) {
        for (int j = 1; j <= n; j++) {
            if (j <= i)
                cout << j;
            else
                cout << " ";
        }
        for (int k = 2*n; k > 0; k--) {
            if (k <= i)
                cout << k;
        }
        cout << endl;
    }
    return 0;
}