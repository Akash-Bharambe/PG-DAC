#include <iostream>
#define SIZE 5
using namespace std;

void maximum(int arr[])
{
    int val;
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            if (arr[i] < arr[j])
                val = arr[j];

    cout << val << endl;
}
void minimum(int arr[])
{
    int val;
    for (int i = 0; i < SIZE; i++)
        for (int j = 0; j < SIZE; j++)
            if (arr[i] > arr[j])
                val = arr[j];
    cout << val << endl;
}

void fiveTimes(int arr[])
{

    for (int i = 0; i < SIZE; i++)
        arr[i] = 5 * arr[i];
    for (int i = 0; i < SIZE; i++)
        cout << arr[i] << " ";
}

int main()
{

    int arr[SIZE];
    for (int i = 0; i < SIZE; i++)
        cin >> arr[i];
    maximum(arr);
    minimum(arr);
    fiveTimes(arr);
}
