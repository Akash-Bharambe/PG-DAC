List<E> features
1. List represents ordered collection --- order is significant(It remembers the order of insertion)
2. Allows null references
3. Allows duplicates
4. Supports index based operation


List implementation class 
1. ArrayList<E> - generic class
List implementation class , backed up resizable array.
It addionally implements - RandomAccess i/f
Time complexity
get,set , size  -- run in constant time perfomance -O(1)
add / remove  -- O(n) --variable time performance (depending upon n-size of list)
Constructors - 

1. ArrayList() -- default constructor. -- creates EMPTY array list object , with init capacity=10,size=0;
eg ---ArrayList<Integer> l1=new ArrayList<>();

1.5 ArrayList<E>  -- constructor
API 
public ArrayList(int capacity) -- -- creates EMPTY array list object , with init capacity=capacity,size=0;
eg ---ArrayList<Integer> l1=new ArrayList<>(100);
l1.add(1);.....l1.add(100);
l1.add(101);//capa=150 --as per JVM spec.


2. add methods
boolean add(E e)  --- appends the element(ref) to the list 
void add(int index,E e) --- inserts the specified element at the specified index
void addAll(Collection<E> e) -- bulk append operation (i.e appends all refs from the specified Collection to this list)
eg : l1 --- ArrayList<Emp>
l1.addAll(.....);
Which are the legal arguments ?
AL,LL,Vector --- legal
HS,TS,LHS --legal
HM,LHM,TM --illegal --javac error


2.5 To get an element from list 
E get(int index)
valid index ranges from : 0 -(size-1)
Otherwise - JVM will throw - java.lang.IndexOutOfBoundsException

3. To display list contents use  --- toString
OR 
for -each OR 
explicitly attach iterator.


4. Attaching Iterator
Collection<E> interface method -- implemented by ArrayList
Iterator<E> iterator()
---places iterator BEFORE 1st element ref.
Iterator<E> i/f methods 
boolean hasNext() -- rets true if there exists next element, false otherwise.

E next() --- returns the element next to iterator position

void remove() -- removes last returned element from iterator.

Limitation --- type forward only & can start from 1st elem only.

Regarding exceptions with Iterator/List
1. java.util.NoSuchElementException -- thrown whenever trying to access the elem beyond the size of list via Iterator/ListIterator 's next() method.
2. java.lang.IllegalStateException --- thrown whenever trying to remove elem before calling next().
3. java.util.ConcurrentModificationException-- thrown typically --- when trying to use same iterator/list iterator --after structrually modifying list(eg add/remove methods of list)
Above describes fail-fast behaviour of the Iterator/ListIterator

Why is this behavior  called fail-fast ?
In case of such concurrent modification , instead of risking the wrong o/p , JVM decides to abort the iteration by throwing the exception.(i.e decides to fail FAST!)

Exception while accessing element by index.

4. java.lang.IndexOutOfBoundsException -- thrown typically  -- while trying to access elem beyond size(0---size-1) --via get/set/remove methods of List.


6. Attaching for-each  = attaching implicit iterator.

Attaching ListIterator ---scrollable iterator or to beign iteration from a specific element -- List ONLY or list specific iterator.
ListIterator<E> listItearator() --places LI before 1st element
ListIterator<E> listItearator(int index) --places LI before specified index.



4. To search for a particular element in list
boolean contains(Object o)

NOTE : Internally invokes , list element type's 
 public boolean equals(Object o)

eg : ArrayList<Customer> list=new ArrayList<>();
list.add(c1);.......list.add(c100);
To find out if customers exists or not  , what is required , before you can call contains ? 
Prog has to override -- equals method, inherited from Object class ,  to replace ref equality by content equality(Unique ID | PK)

Customer c=new  Customer(email);
list.contains(c);//if equals method rets true , contains will ret true.


5. To search for 1st occurrence of the specified element 
int indexOf(Object o)
rets index of 1st occurrence of specified elem. Rets -1 if elem not found.

searching for last occurrence 
int lastIndexOf(Object o)
rets index of last occurrence of specified elem. Rets -1 if elem not found.
NOTE : Internally invoke equals.

5.5
E set(int index,E e)
Replaces old elem at spepcified index by new elem.
Returns old elem

6. remove methods
E remove(int index) ---removes elem at specified index & returns removed elem.
boolean  remove(Object o) --- removes element specified by argument , rets true -- if elem is removed or false if elem cant be removed.


NOTE : 
For searching or removing based upon primary key , in List Implementation classes --- All search/remove methods (contains,indexOf,lastIndexOf,remove(Object o)) -- based upon equals method(of type of List eg --Account/Customer/Emp/Vehicle...)
For correct working
1. Identify prim key & create overloaded constr using PK.
eg : public Emp(int id) { this.id=id;}

2. Using PK , override equals for content equality.

Detailed Explanation : 

Usage eg : ArrayList<Emp> emps=new AL<>();
emps.add(e1);//id=10
emps.add(e2);//id=20
emps.add(e3);//id=30

int index=emps.indexOf(20);//int ---> Integer --> Object (Integer)
Integer i=new Integer(20); // javac 
//internally invokes equals : 
i.equals(e1)  ---since it's incomptabile types --rets false
i.equals(e2)  ---since it's incomptabile types --rets false
i.equals(e3)  ---since it's incomptabile types --rets false
Thus : indexOf rets -1
sop(index);// -1

Solution : 
Emp e=new Emp(20);
int index=emps.indexOf(e);

e.equals(e1)  ---it's compatabile types BUT ids are different --rets false
e.equals(e2)  --- it's comptabile types --ids are SAME --rets true

Thus : indexOf rets 1
sop(index);// 1




Conversion from collection to array
Object[] toArray() -- non generic version --- rets array of objects

T[] toArray(T[] type)
T = type of collection .
Rets array of actual type.


Sorting --- For sorting elements as per Natural(implicit i.e criteria defined within UDT class definition) ordering or Custom(explicit i.e criteria defined outside UDT , in a separate class or anonymus iner class)

Steps for Natural ordering
Natural Ordering is specified in generic i/f
java.lang.Comparable<T>
T -- UDT , class type of the object to be compared.
eg -- Emp,Account , Customer
I/f method
int compareTo(T o)
Steps 
1. UDT must implement Comparable<T>
eg : public class Account implements Comparable<Account>
2. Must override method
public int compareTo(T o)
{
 use sorting criteria to ret
< 0 if this < o,
=0 if this = o
> 0 if this > o

}
3.Use java.util.Collections class API
Method
public static void sort(List<T> l1)
l1 -- List of type T.

sort method internally invokes compareTo method(prog supplied) of UDT & using advanced sorting algorithm , sort the list elems.


Limitation of natural Ordering
Can supply only 1 criteria at given time & that too is embedded within UDT class definition
Instead keep sorting criteria external --using Custom ordering


Typically use -- Natural ordering in consistence with equals method.


Alternative is Custom Ordering(external ordering)
I/f used is --- java.util.Comparator<T>
T -- type of object to be compared.
 
Steps
1. Create a separate class (eg. AccountBalComparator) which implements Comparator<T>
eg 
public class AccountBalComparator implements Comparator<Account>

2.Implement(override) i/f method -- to supply comparison criteria.

int compare(T o1,T o2)
Must return 

< 0 if o1<o2
=0 if o1=o2
> 0 if o1 > o2
3. Invoke Collections class method for actual sorting.
public static void sort(List<T> l1,Comparator<T> c)
parameters
l1 --- List to be sorted(since List is i/f --- any of its implementation class inst. can be passed)
c -   instance of the class which has implemented compare method.(or implemented Comparator)

Internally sort method invokes compare method from the supplied Comparator class instance.
