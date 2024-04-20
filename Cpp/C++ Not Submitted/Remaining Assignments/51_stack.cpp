#include <iostream>
using namespace std;

class StackException : public runtime_error
{
public:
    StackException(string msg);
};

StackException::StackException(string msg) : runtime_error(msg) {}

template <class T>
class Stack
{
private:
    int top;
    const int SIZE;
    T *p;

public:
    Stack(const int);
    void pop();
    void push(T);
    bool isEmpty();
    bool isFull();
    ~Stack();
};

template <class T>
Stack<T>::Stack(const int SIZE) : top(-1), SIZE(SIZE)
{
    p = new T[SIZE];
}

template <class T>
void Stack<T>::pop()
{
    if (isEmpty())
    {
        throw StackException("Stack is Empty...!!!");
    }
    cout << p[top] << " popped" << endl;
    top--;
}

template <class T>
void Stack<T>::push(T element)
{
    if (isFull())
    {
        throw StackException("Stack is Full");
    }
    top++;
    p[top] = element;
    cout << element << " added" << endl;
}

template <class T>
bool Stack<T>::isEmpty()
{
    return this->top == -1;
}

template <class T>
bool Stack<T>::isFull()
{
    return this->top == this->SIZE - 1;
}

template <class T>
Stack<T>::~Stack()
{
}

int main()
{
    Stack<int> s(3);
    try
    {
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
    catch (const exception &e)
    {
        std::cerr << e.what() << '\n';
    }

    return 0;
}