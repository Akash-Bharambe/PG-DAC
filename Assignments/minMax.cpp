#include <iostream>
using namespace std;
int min;
int max;
int secondMax;
int secondMin;
void acceptArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << "Enter value " << i + 1 << ": ";
        cin >> arr[i];
    }
}

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    
    return 0;
}