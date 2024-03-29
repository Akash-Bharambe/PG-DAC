#ifndef STRING_H
#define STRING_H

class String
{
private:
    char *p;
    int size;

public:
    String(char ch[]);
    String(int, const char *);
    String(const String &);
    void display() const;
    ~String();
};

#endif