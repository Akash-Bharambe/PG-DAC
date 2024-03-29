#ifndef FUNCTIONS_H
#define FUNCTIONS_H
#include"student.h"
class Utils
{
public:
    static int menulist();
    static void readerr(ifstream &, const Student &);
    static void writerr(ofstream &, Student &);
};

#endif