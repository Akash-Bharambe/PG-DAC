#ifndef FUNCTIONS_H
#define FUNCTIONS_H
#include "student.h"
#include <stdexcept>
#include <string>
class Utils
{
public:
    static int menulist();
    static void readerr(char[], const Student &);
    static void writerr(char[], Student &);
};

class FileNotOpenedException : public runtime_error
{
private:
    string message;

public:
    FileNotOpenedException(string);
    string what();
    ~FileNotOpenedException() throw();
};

#endif