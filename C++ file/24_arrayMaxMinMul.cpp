// 24. Accept five integers in an array and use separate functions to:
// a. Find maximum and minimum of the integers. Do not sort the array.
// b. Multiply each element of the array by 5 and store it in another array and display it.

#include <iostream>
#define SIZE 5
using namespace std;

void maximum(int arr[])
{
    int val = INT8_MIN;
    for (int i = 0; i < SIZE; i++)
        val = (val < arr[i]) ? arr[i] : val;
    cout <<"Maximum: "<< val << endl;
}
void minimum(int arr[])
{
    int val = INT8_MAX;
    for (int i = 0; i < SIZE; i++)
        val = (val > arr[i]) ? arr[i] : val;
    cout <<"Minimum: "<< val << endl;
}

void fiveTimes(int arr[], int arr5[])
{
    for (int i = 0; i < SIZE; i++)
        arr5[i] = 5 * arr[i];
}

int main()
{

    int arr[SIZE];
    for (int i = 0; i < SIZE; i++)
    {
        cout << "Enter Value at index " << i << ": ";
        cin >> arr[i];
    }
    maximum(arr);
    minimum(arr);
    int arr5[SIZE];
    fiveTimes(arr, arr5);
    cout << "Five Times Array: " << endl;
    for (int i = 0; i < SIZE; i++)
        cout << arr5[i] << " ";
}
