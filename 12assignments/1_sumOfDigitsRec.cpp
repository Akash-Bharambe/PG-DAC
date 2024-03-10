#include<iostream>
using namespace std;

int sumOfDigits(int num);
int sum =0;
int main(){
	int input;
	cout<<"Enter 4 digit Number: ";
	cin>>input;

	cout<<sumOfDigits(input)<<endl;
	return 0;
}

int sumOfDigits(int num){
	while(num != 0){
		sum += num % 10;
		num /= 10;	
	}
	return sum;

}
