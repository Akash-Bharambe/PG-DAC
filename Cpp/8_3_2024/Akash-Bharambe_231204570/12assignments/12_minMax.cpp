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

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

int minF(int arr[], int n)
{
    int mini = INT_MAX;
    for (int i = 0; i < n; i++)
        if (mini > arr[i])
            mini = arr[i];
    return mini;
}

int secondMin(int arr[], int n)
{
    int secondMin = INT_MAX;
    int mini = INT_MAX;
    for (int i = 0; i < n; i++)
    {
        if (mini > arr[i])
        {
            secondMin = mini;
            mini = arr[i];
        }
        else if (arr[i] < secondMin && arr[i] != mini)
            secondMin = arr[i];
    }

    return secondMin;
}

int secondMax(int arr[], int n)
{
    int secondMax = INT_MIN;
    int maxi = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (maxi < arr[i])
        {
            secondMax = maxi;
            maxi = arr[i];
        }
        else if (arr[i] > secondMax && arr[i] != maxi)
            secondMax = arr[i];
    }

    return secondMax;
}

int maxF(int arr[], int n)
{
    int maxi = INT_MIN;
    for (int i = 0; i < n; i++)
        if (maxi < arr[i])
            maxi = arr[i];
    return maxi;
}

int main()
{
    int n;
    cout << "Enter size of array: ";
    cin >> n;
    int arr[n];
    acceptArray(arr, n);
    printArray(arr, n);
    cout << endl;
    cout << "Maximum Number: " << maxF(arr, n) << endl;
    cout << "Second Maximum Number: " << secondMax(arr, n) << endl;
    cout << "Second Minimum Number: " << secondMin(arr, n) << endl;
    cout << "Minimum Number: " << minF(arr, n) << endl;
    return 0;
}