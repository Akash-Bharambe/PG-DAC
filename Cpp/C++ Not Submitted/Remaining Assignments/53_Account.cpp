#include <iostream>
using namespace std;

class OverLimitException : public runtime_error
{
public:
    OverLimitException(string msg) : runtime_error(msg) {}
};

class InsufficientBalanceException : public runtime_error
{
public:
    InsufficientBalanceException(string msg) : runtime_error(msg) {}
};

class Account
{
private:
    double balance;

public:
    Account(double);
    void deposit(double);
    void withdraw(double);
};

Account::Account(double balance) : balance(balance) {}

void Account::deposit(double amt)
{
    this->balance += amt;
    cout << "Rs " << amt << " deposited" << endl;
}

void Account::withdraw(double amt)
{
    if (amt > 15000)
    {
        throw OverLimitException("Cannot withdraw more than Rs. 15000/-");
    }
    if (amt > this->balance)
    {
        throw InsufficientBalanceException("Insufficient Balance...!!!");
    }
    this->balance -= amt;
    cout << "Rs " << amt << " writhdraw" << endl;
}

int main()
{
    Account a(10000);
    try
    {
        a.deposit(10000);
        // a.withdraw(16000);
        a.withdraw(10000);
        a.withdraw(10000);
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }

    return 0;
}