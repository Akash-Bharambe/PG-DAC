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
