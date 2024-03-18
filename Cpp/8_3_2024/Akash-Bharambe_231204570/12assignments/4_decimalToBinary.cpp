#include <iostream>
using namespace std;

void decimalToBinary(int n) {
    if (n == 0 || n == 1)
        cout << n;
    else {
        decimalToBinary(n / 2);
        cout << n % 2;
    }
}

int main() {
    int decimal;
    cout << "Enter a decimal number: ";
    cin >> decimal;
    cout << "Binary equivalent: ";
    decimalToBinary(decimal);
    cout << endl;

    return 0;
}
