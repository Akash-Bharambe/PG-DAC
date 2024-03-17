// 32. Define a structure “Book” having members – bookId, title, price.
//      Use typedef to name this structure “BOOK”.
//      Accept the data for a book and display the record.

#include <iostream>
#include <string>
using namespace std;

typedef struct Book
{
private:
    int bookId;
    string title;
    float price;

public:
    void accept()
    {
        cout << "Enter Book Id: ";
        cin >> this->bookId;
        cout << "Enter Book Title: ";
        cin >> this->title;
        cout << "Enter Book Price: ";
        cin >> this->price;
    }

    void display()
    {
        cout << "Book Id: " << this->bookId << endl;
        cout << "Book Title: " << this->title << endl;
        cout << "Book Price: " << this->price << endl;
    }
} BOOK;

int main()
{
    BOOK b1;
    b1.accept();
    b1.display();
    return 0;
}