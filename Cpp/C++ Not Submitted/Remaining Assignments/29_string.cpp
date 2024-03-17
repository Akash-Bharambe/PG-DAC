// 29. Write a program to accept a string from the user.
//     Write separate functions to perform the following:
//     a. Find the number of occurrences of given character in the string
//     b. Find the number of blank spaces in the string.
//     c. Find the number of words in the string.
//     d. Find the total number of all the vowels in the string.

#include <iostream>
#include <string>
using namespace std;

void accept(string &s)
{
    cout << "Enter String: ";
    getline(cin, s);
}

void display(string &s)
{
    cout << s << endl;
}

void countChar(string &s)
{
    int count = 0;
    char ch;
    cout << "Enter character: ";
    cin >> ch;
    for (int i = 0; i < s.size(); i++)
        s[i] == ch ? count++ : count;
    cout << "No of occurrences of " << ch << " are: " << count << endl;
}

int countSpace(string &s)
{
    int count = 0;
    for (int i = 0; i < s.size(); i++)
        if (s[i] == ' ')
            count++;
    return count;
}

int countWords(string &s)
{
    int count = 0;
    bool inWord = false;
    for (int i = 0; i < s.size(); i++) {
        if (s[i] == ' ') {
            inWord = false;
        } else if (!inWord) {
            count++;
            inWord = true;
        }
    }
    return count;
}

int countVowels(string &s)
{
    int count = 0;
    char vowels[5] = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < s.size(); i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if (s[i] == vowels[j])
            {
                count++;
                break;
            }
        }
    }
    return count;
}

int main()
{
    string s;
    accept(s);
    display(s);
    //countChar(s);
    cout << "No of spaces: " << countSpace(s)<<endl;
    cout << "No of Words: " << countWords(s)<<endl;
    cout << "No of Vowels: " << countVowels(s);

    return 0;
}