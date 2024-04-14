#ifndef PERSON_H
#define PERSON_H
#include <string>
using namespace std;
class Person
{
private:
    string name;
    int age;

public:
    Person(string ,int );
    string getName();
    int getAge();
    ~Person();
};

#endif