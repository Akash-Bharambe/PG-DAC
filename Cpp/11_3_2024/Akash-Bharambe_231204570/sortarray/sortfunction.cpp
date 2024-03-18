#include<iostream>
#include"sortHead.h"

using namespace std;

void acceptarray(int arr[],int n){
    cout<<"enter the elements of array "<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
}
void sortingarray(int arr[],int size){
      int temp;
      for(int i=0;i<size;i++){
        for (int j = 0; j < size; j++)
        {
            if(arr[i]<arr[j]){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        
      }

}
}

void printarray(int arr[],int n){
      for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}