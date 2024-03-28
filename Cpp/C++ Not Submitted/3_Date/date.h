// 3. Create Date class with data members
// dd
// mm
// yyyy
// and implement following
//  Default constructor
//  Parameterized constructor
//  Destructor
//  Function to find out difference between two
// dates
//  Function to compare dates
//  Separate header and implementation files
//  Overlaod ==, !=, +, - operator

#ifndef DATE_H
#define DATE_H

class Date
{
private:
    int dd;
    int mm;
    int yy;

public:
    Date();
    Date(int, int, int);
    int diffDate(Date);
    ~Date();
};
bool isLeapYear(int);
int getDaysInMonth(int, int);
#endif