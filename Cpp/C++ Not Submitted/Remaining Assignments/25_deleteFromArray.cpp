// 25. Write a program to delete an element from a user entered array.
//     Accept position of element to be deleted from user.

#include <iostream>
using namespace std;

void acceptArray(int arr[] , int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << "Enter element at index " << i << ": ";
        cin >> arr[i];
    }
}

void displayArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
}

void deleteAtPosition(int indexDel, int arr[], int size)
{
    for (int i = 0; i < size; i++)
        if (i >= indexDel)
            arr[i] = arr[i + 1];
}

int main()
{
    int size;
    cout<<"Enter Size of Array: ";
    cin>>size;
    int arr[size];
    int indexDel;
    acceptArray(arr, size);
    cout << "Array Before Deletion: " << endl;
    displayArray(arr, size);
    do
    {
    cout << "\nIndex to Delete: ";
    cin >> indexDel;
    } while (indexDel >= size || indexDel < 0);
    
    deleteAtPosition(indexDel, arr, size--);
    cout << "Array After Deletion: " << endl;
    displayArray(arr, size);
    return 0;
}