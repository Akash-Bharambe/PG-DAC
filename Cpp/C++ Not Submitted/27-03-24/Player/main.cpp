#include"CKTPlayer.h"
#include"FootBPlayer.h"
#include<iostream>
using namespace std;

int main()
{
    Player *p;
    CKTPlayer c1;
    FOOTBPlayer f1;
    p = &c1;
    p->accept();
    p->display();
    p = &f1;
    p->accept();
    p->display();
    return 0;
}