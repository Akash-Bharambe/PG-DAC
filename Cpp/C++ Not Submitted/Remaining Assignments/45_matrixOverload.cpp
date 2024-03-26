// 1.	Write a class Matrix which will store elements of integer matrix (two dimensional array) in dynamically allocated space. Provide below functions in matrix class -
// 	1. Default constructor - Take 3 as default row and column size. Initialize the matrix elements to 0
// 	2. Parameterized constructor - Takes row and column size as parameters. Initialize matrix to 0.
// 	3. Copy constructor - Performs deep copy of matrix object.
// 	4. Destructor - Deletes memory which is allocated dynamically.
// 	5. Overloaded + operator - Performs addition of two matrices.
// 	6. Overloaded ! operator - Calculates transpose of a user entered square matrix.
// 	7. Overload >> - Accepts row & column size from user. Also accepts matrix elements from user.
// 	8. Overload << - Displays matrix.

#include <iostream>
using namespace std;

class Matrix
{
private:
    int i;
    int j;
    int **arr;

public:
    Matrix();
    Matrix(int, int);
    Matrix(const Matrix &);
    const Matrix operator!() const;
    const Matrix operator+(const Matrix &) const;
    ~Matrix();

    friend ostream &operator<<(ostream &, const Matrix &);
    friend istream &operator>>(istream &,  Matrix &);
};

Matrix::Matrix() : i(3), j(3)
{
    this->arr = new int *[i];

    for (int x = 0; x < j; x++)
        arr[x] = new int[j];
    for (int x = 0; x < i; x++)
        for (int y = 0; y < j; y++)
            arr[x][y] = 0;
}

Matrix::Matrix(int i, int j) : i(i), j(j)
{
    this->arr = new int *[i];

    for (int x = 0; x < j; x++)
        arr[x] = new int[j];
    for (int x = 0; x < i; x++)
        for (int y = 0; y < j; y++)
            arr[x][y] = 0;
}

Matrix::Matrix(const Matrix &m) : i(m.i), j(m.j)
{
    this->arr = new int *[i];
    for (int x = 0; x < i; x++)
        arr[x] = new int[j];
    for (int x = 0; x < i; x++)
        for (int y = 0; y < j; y++)
            arr[x][y] = m.arr[x][y];
}

const Matrix Matrix::operator!()const
{
    Matrix temp(this->i, this->j);
    for (int x = 0; x < this->i; x++)
    {
        for (int y = 0; y < this->j; y++)
        {
            temp.arr[x][y] = this->arr[y][x];
        }
    }
    return temp;
}

const Matrix Matrix::operator+(const Matrix &that)const
{
    Matrix sum(this->i, this->j);
    for (int x = 0; x < this->i; x++)
    {
        for (int y = 0; y < this->j; y++)
        {
            sum.arr[x][y] = this->arr[x][y] + that.arr[x][y];
        }
    }
    return sum;
}

Matrix::~Matrix()
{
    for (int x = 0; x < j; x++)
        delete[] arr[x];
    delete[] arr;
}

ostream &operator<<(ostream &os, const Matrix &m)
{
    for (int x = 0; x < m.i; x++)
    {
        for (int y = 0; y < m.j; y++)
            os << m.arr[x][y] << " ";
        os << endl;
    }
    return os;
}

istream &operator>>(istream &is, Matrix &m)
{
    for (int x = 0; x < m.i; x++)
    {
        m.arr[x] = new int[m.j];
        for (int y = 0; y < m.j; y++)
        {
            cout << "Enter i" << x + 1 << " j" << y + 1 << ": ";
            is >> m.arr[x][y];
        }
    }
    return is;
}

int main()
{
    Matrix m;
    cin >> m;
    Matrix a = !m;
    cout << m << endl
         << a << endl
         << "\nSum:\n"
         << a + m;
    return 0;
}