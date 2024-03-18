#include<iostream>
#include"sortHead.h"
using namespace std;
int main()
{
    int n;
    cout<<"enter  the size of array"<<endl;
    cin>>n;
    int arr[n];
     acceptarray(arr, n);
     sortingarray(arr,n);
     printarray(arr, n);
    return 0;
}
