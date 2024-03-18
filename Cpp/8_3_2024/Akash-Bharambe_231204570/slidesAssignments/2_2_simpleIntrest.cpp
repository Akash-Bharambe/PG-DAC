#include <iostream>
using namespace std;
int main()
{
	int p, r, t;
	int simpleIntrest;
	cout << "enter the principle" << endl;
	cin >> p;
	cout << "enter rate of intrest" << endl;
	cin >> r;
	cout << "enter time period" << endl;
	cin >> t;
	simpleIntrest = (p * r * t) / 100;
	cout << "Simple Intrest: " << simpleIntrest << endl;
	return 0;
}
