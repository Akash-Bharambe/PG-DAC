// 33. Modify above assignment - 32 to hold record of five books.
// Display the records of all the books using a function.

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

void displayAll(BOOK arr[])
{
    for (int i = 0; i < 5; i++){
        cout << "\nDetails for Book " << i + 1 << ": " << endl;
        arr[i].display();
    }
}

int main()
{
    BOOK barr[5];
    for (int i = 0; i < 5; i++)
    {
        cout << "\nData for Book " << i + 1 << ": " << endl;
        barr[i].accept();
    }
    displayAll(barr);
    return 0;
}