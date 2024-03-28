#include "CKTPlayer.h"
#include "FootBPlayer.h"
using namespace std;

int main()
{
    Player *p;
    CKTPlayer c1;
    FOOTBPlayer f1;
    c1.accept();
    f1.accept();
    c1.display();
    f1.display();
    p = &c1;
    p->accept();
    p->display();
    return 0;
}