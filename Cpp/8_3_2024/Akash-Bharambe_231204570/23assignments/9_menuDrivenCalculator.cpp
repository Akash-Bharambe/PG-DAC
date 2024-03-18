#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int no1, no2;
    int result = 0;
    char ch;
    do
    {

        cout << "\n + for Add";
        cout << "\n - for Sub";
        cout << "\n * for Mult";
        cout << "\n / for Div";
        cout << "\n 0 for exit" << endl;

        cout << "Enter your choice: ";
        cin >> ch;
        switch (ch)
        {
        case '+':
        {
            cout << "\n Enter First no: ";
            cin >> no1;
            cout << "\n Enter Secondt no: ";
            cin >> no2;
            result = no1 + no2;
            cout << "\n Result: " << result;
        };
        break;
        case '-':
        {
            cout << "\n Enter First no: ";
            cin >> no1;
            cout << "\n Enter Secondt no:";
            cin >> no2;
            result = no1 - no2;
            cout << "\n Result: " << result;
        };
        break;
        case '*':
        {
            cout << "\n Enter First no: ";
            cin >> no1;
            cout << "\n Enter Secondt no: ";
            cin >> no2;
            result = no1 * no2;
            cout << "\n Result: " << result;
        };
        break;
        case '/':
        {
            cout << "\n Enter First no: ";
            cin >> no1;
            cout << "\n Enter Secondt no: ";
            cin >> no2;
            result = no1 / no2;
            cout << "\n Result: " << result;
        };
        break;
        case '0':
            exit(0);
        }
    } while (ch != '0');
    return 0;
}
