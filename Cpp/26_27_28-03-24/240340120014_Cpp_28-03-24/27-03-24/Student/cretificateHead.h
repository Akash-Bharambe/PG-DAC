#ifndef CERTIFICATE_HEAD
#define CERTIFICATE_HEAD
#include <string>
using namespace std;

class Certificate
{
private:
    string certiName;
    int certiNumber;
    string issuingAuth;

public:
    Certificate();
    Certificate(string certiName, int certiNumber, string issuingAuth);
    void accept();
    void display();
    ~Certificate();
};

#endif