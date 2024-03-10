#include <iostream>
#include "head.h"
using namespace std;
int menu()
{
	int n;
	cout << "1. add" << endl;
	cout << "2. sub" << endl;
	cout << "3. mult" << endl;
	cout << "4. div" << endl;
	cout << "0. exit" << endl;
	cout << "Enter Your Choice: " << endl;
	cin >> n;
	return n;
}
void input(int *pa, int *pb)
{
	int a, b;
	cout << "Enter a: ";
	cin >> a;
	*pa = a;
	cout << "Enter b: ";
	cin >> b;
	*pb = b;
}
void add(int a, int b)
{
	cout << "the addition of two number: " << a + b << endl;
}
void sub(int a, int b)
{
	cout << "the sub of two number is: " << a - b << endl;
}
void mult(int a, int b)
{
	cout << "the mult of two number is: " << a * b << endl;
}
void divi(int a, int b)
{
	cout << "the div of two number is: " << a / b << endl;
}
