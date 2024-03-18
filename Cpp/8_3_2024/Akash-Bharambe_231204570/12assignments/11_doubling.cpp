#include <iostream>
using namespace std;

void twice(int arr[], int n){
    cout<<"Enter all numbers: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        arr[i]*=2;
    }
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
}

int main()
{
    int n;
    cout<<"Enter count of numbers you want to enter: ";
    cin>>n;
    int arr[n];
    twice(arr,n);
    return 0;
}