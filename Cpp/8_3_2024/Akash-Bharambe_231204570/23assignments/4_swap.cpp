#include <iostream>
using namespace std;
int main()
{
	int sum;
	int input;
	cout << "Enter 2 number: ";
	cin >> sum >> input;
	cout << "Before Swap a: " << sum << "b: " << input << endl;
	int temp;
	temp = sum;
	sum = input;
	input = temp;
	cout << "After Swap  a: " << sum << "b: " << input << endl;
	return 0;
}
