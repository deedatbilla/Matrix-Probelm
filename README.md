
In many mathematical filter problems the filtering is implemented by sparse matrix. Sparse matrix is a matrix where the most of the values are zeros.

Now you should create - using Java and/or C++ language - a sparse matrix application where matrix size is mathematically unlimited. 


Matrix class is the main class containing private map<Point,int> object called cells, which should contain ONLY those key-value-pairs where value is not zero. The key is Point, (x,y)-coordinate combination and value is int. x and y -indexing begins from zero. Map key-value-pairs should be sorted primarily by x and secondarily by y. Instructions:
- C++: map sorts naturally ascending by the key. Now when the key is Point object, you have to implement global function: 
bool operator<(const Point& a, const Point& b)
- Java: You should instantiate map withTreeMap-object, which holds data naturally sorted. So, you have to implement Point class: 
public class Point implements Comparable{
...
public int compareTo(Point o){
...
}
}

Matrix class has public member functions:

void set(int x, int y, int value)
set() function sets or inserts or replaces key-value-pair if value is not zero. If the value is zero, insert is not done and if (x,y) key exists the key-value-pair is removed.

int get(int x, int y)
get() function returns value by (x,y). If (x,y) is found, the value is returned. If not, zero is returned.

void product(int coefficient)
multiplies all matrix values by coefficient.

bool sum(Matrix other)
If other matrix has same dimensions, the sum is calculated to "this" matrix and sum() returns true. If this and other matrix has different dimensions, sum cannot be calculated and sum() returns false.

int getRowCount()
returns row count, so maxY+1

int getColCount()
returns column count, so maxX+1

void print()
Prints matrix contents in matrix form. So, if matrix contains (4,3)/5 and (3,4)/6, matrix is printed in console:
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 5
0 0 0 6 0

Note: It is recommended to use get() function in print() function! First however the matrix minimal dimensions should be found out: MaxRow and MaxColumn..

Also create main()-function where you demonstrate all functionality of Matrix class. Good choice would be to create simple menu for the console application..
