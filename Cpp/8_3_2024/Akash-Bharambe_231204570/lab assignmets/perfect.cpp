#include<iostream>
using namespace std;
int main(){
int input;
int sum=0;
cout<<"Enter Number"<<endl;
cin>>input;
for(int i =1;i<=input/2;i++){
	if(input%i==0){
		sum+=i;
	}
}
if(input==sum){
	cout<<"prefect"<<endl;
}
else 
	cout<<"not prefect"<<endl;
return 0;
}
