#include <iostream>
using namespace std;

void acceptArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << "Enter value " << i + 1 << ": ";
        cin >> arr[i];
    }
}

void swap(int &a, int &b)
{
    a ^= b;
    b ^= a;
    a ^= b;
}

void sortArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[j] > arr[i])
                swap(arr[j], arr[i]);
        }
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
    int n;
    cout << "Enter size of array: ";
    cin >> n;
    int arr[n];
    acceptArray(arr, n);
    sortArray(arr, n);
    printArray(arr, n);

    return 0;
}