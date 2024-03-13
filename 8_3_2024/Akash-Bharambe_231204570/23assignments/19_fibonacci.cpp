#include<iostream>
using namespace std;
int fibonacci(int num){
	if(num == 1 || num == 0)
		return num;
	else
		return fibonacci(num-1) + fibonacci(num-2);
}

int main(){
	int num;
	cout<<"How many terms of fionacci series are required: ";
	cin>>num;
	for(int i=0;i<num;i++)
		cout<<fibonacci(i)<<" ";	
	return 0;
}

