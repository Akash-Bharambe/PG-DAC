#include <iostream>
#include "head.h"
using namespace std;
int main()
{
	int n, a, b;
	do
	{
		input(&a, &b);
		switch (n = menu())
		{
		case 1:
			add(a, b);
			break;
		case 2:
			sub(a, b);
			break;
		case 3:
			mult(a, b);
			break;
		case 4:
			divi(a, b);
			break;
		}
	} while (n != 0);
	return 0;
}
