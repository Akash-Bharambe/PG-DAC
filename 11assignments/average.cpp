#include <iostream>
using namespace std;

int sum =0;
void average(int arr[], int n){
    cout<<"Enter numbers: ";
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
        sum += arr[i];
    }
    cout<<"Average of ";
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<": "<<sum/n;
}

int main()
{
    int n;
    cout<<"Enter count of numbers you want to enter: ";
    cin>>n;
    int arr[n];
    average(arr,n);
    
    return 0;
}