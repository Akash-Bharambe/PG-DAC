#include <iostream>
using namespace std;

template <typename T>
void sortAny(T arr[], int l)
{
    for (int i = 0; i < l; i++)
    {
        for (int j = i; j < l; j++)
        {
            if (arr[i] > arr[j])
            {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main()
{
    int arr1[] = {5, 3, 2, 4, 1};
    char arr[] = {'x','e','w','g','h','d'};
    int l = sizeof(arr) / sizeof(arr[0]);
    sortAny(arr, l);
    for (int i = 0; i < l; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}