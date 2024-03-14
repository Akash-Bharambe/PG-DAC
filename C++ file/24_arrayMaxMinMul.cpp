#include<iostream>
#define SIZE 5
using namespace std;

void maximum(int maxi[]){
            int val;
        for(int i=0;i<SIZE;i++){
        for(int j=0;j<SIZE;j++){
            if(maxi[i]<maxi[j]){
                val=maxi[j];
            }

        }
    }
    cout<<val<<endl;
}
void min(int mini[]){
            int val;
        for(int i=0;i<SIZE;i++){
        for(int j=0;j<SIZE;j++){
            if(mini[i]>mini[j]){
                val=mini[j];
            }

        }
    }
    cout<<val<<endl;
}

void mul(int mult[]){
    
    for(int i=0;i<SIZE;i++){
        mult[i]=5*mult[i];
    }
    for (int i = 0; i < SIZE; i++)
    {
        cout<<mult[i]<<" ";
    }
    
}


int main(){
    
    int arr[SIZE];
    for(int i=0;i<SIZE;i++){
        cin>>arr[i];
    }
    maximum(arr);
    min(arr);
    mul(arr);

}