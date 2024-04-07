Regarding inheritance

In OOP, we often organize classes in hierarchy to avoid duplication and reduce redundancy. The classes in the lower hierarchy inherit all the variables (attributes/state) and methods (dynamic behaviors) from the higher hierarchies. 

A class in the lower hierarchy is called a subclass (or derived, child, extended class). A class in the upper hierarchy is called a superclass (or base, parent class). 

By pulling out all the common variables and methods into the superclasses, and leave the specialized variables and methods in the subclasses, redundancy can be greatly reduced or eliminated as these common variables and methods do not need to be repeated in all the subclasses. Re usability is maximum.

A subclass inherits all the member variables and methods from its superclasses (the immediate parent and all its ancestors). It can use the inherited methods and variables as they are. It may also override an inherited method by providing its own version, or hide an inherited variable by defining a variable of the same name.

Summary : Sub class IS-A super class , and something more (additional state + additional methods) and something modified(behaviour --- method overriding)

eg :
Person,Student,Faculty 
Emp,Manager,SalesManager,HRManager,Worker,TempWorker,PermanentWorker
Shape, Circle,Rectangle,Cyllinder,Cuboid
BankAccount ,LoanAccount,HomeLoanAccount,VehicleLoanAccount,
Student,GradStudent,PostGradStudent

Fruit -- Apple -- FujiApple


A subclass inherits all the variables and methods from its superclasses, including its immediate parent as well as all the ancestors. 

It is important to note that a subclass is not a "subset" of a superclass. In contrast, subclass is a "superset" of a superclass. It is because a subclass inherits all the variables and methods of the superclass; in addition, it extends the superclass by providing more variables and methods.


Inheritance --- generalization ----> specialization. 

IS A Relationship. 

Why -- code re usability.

super class ---base class
sub class --derived class

keyword --extends 



Types of inheritance 
1. single inheritance ---
class A{...} class B extends A{...}
2. multi level inhertance 
class A{...} class B extends A{...} class C extends B{...}
3. multiple inhertiance --- NOT supported
class A extends B,C{...}  -- compiler err

Why --For simplicity.

(Diamond problem)

We have two classes B and C inheriting from A. Assume that B and C are overriding an inherited method and they provide their own implementation. Now D inherits from both B and C doing multiple inheritance. D should inherit that overridden method.  BUT which overridden method will be used? Will it be from B or C? Here we have an ambiguity.




Constructor invocations in inheritance hierarchy -- single & multi level.

eg -- Based on class A -- super class & B its sub class.
Further extend it by class C as a sub-class of B.


super keyword usage
1. To access super class's visible members(data members n methods)
eg : p1 : package 
class A { void show(){sop("in A's show");}}

package p1 : 
class B extends A {
  //overriding form /sub class version
 void show(){sop("in B's show");
   super.show();
}
}
eg : B b1=new B();
b1.show();
2. To invoke immediate super class's matching constructor --- accessible only from sub class constructor.(super(...))



eg : Organize following in suitable class hierarchy(under "inheritance" package) : tight encapsulation
Person -- firstName,lastName
Student --firstName,lastName,grad year,course,fees,marks
Faculty -- firstName,lastName,yrs of experience , sme

Confirm invocation of constructors & super.


Regarding this & super

1. Only a constr can use this(...) or super(..)
2. Has to be 1st statement in the constructor
3. Any constructor can never have both ie. this() & super()
4. super & this (w/o brackets) are used to access (visible) members of super class or the same class.

eg : 
1.Simple example to understand inheritance n polymorphism

1.1 Fruit : name
Add a parametrized constr , to accept name of the fruit.
Add taste() method to display its taste.
eg : public void taste() : "no specific taste"

1.2 Apple : extends Fruit
parametrized constr ---super(name);
override : taste
method definition : sweet n sour in taste

1.3 Similarly : add Orange n Mango
parametrized constr ---super(name);
Add taste() method to display its taste.
Orange : Sour in taste
Mango : sweet in taste

1.5 Write a simple tester : to understand upcasting n run time polymorphism.


2. Another example
Write a Tester to create basket of fruits.
(populate basket based on user choice)

1. Fruit,Apple,Orange,Cherry
Add taste() method to display its taste.

2. Create FruitUtils class. 
Add static method , addFruit to add a fruit to the Fruit Basket.

3. Write a Tester to create basket of fruits.
(populate basket based upon user's choice)
Menu 
1. Add Apple
2. Add Orange
3. Add Cherry
4. Display taste of all fruits in the basket.
5. Exit :  terminate the application.

Menu 
1. Add Apple
2. Add Orange
3. Add Mango
4. Display taste of all fruits in the basket (for-each)
5 : Exit : terminate the application.



2. Create FruitUtils class.(later)
Add static method , addFruit to add a fruit to the Fruit Basket.

Example 2 (Lab work)

1. Shape -- x,y 
Method --public double area()
public String toString()

2. Circle -- x,y,radius
Method --public double area()
public String toString()

3. Rectangle -- x,y,w,h
Method --public double area()
public String toString()

4. Square-- x,y,side
Method --public double area()
public String toString()


5. Create a ShapeFactory class 
Add a method(generateShape)  to return randomly generated shape.


6. Create a Tester . Invoke ShapeFactory's generateShape() method , in a for-loop
to display details & area of each shape.



Polymorphism ---one functionality --multiple (changing) forms
1. static -- compile time --early binding ---resolved by javac.

Achieved via method overloading

rules -- can be in same class or in sub classes.
same method name
signature -- different (no of arguments/type of args/both)
ret type --- ignored by compiler.

eg --- In class Test : 
void test(int i,int j){...}
void test(int i) {..}
void test(double i){..}
void test(int i,double j,boolean flag){..}
int test(int a,int b){...}   //javac error

Can you overload static methods ? Yes (eg : Arrays.toString)



2. Dynamic(run time) polymorphism --- late binding --- dynamic method dispatch ---resolved by JRE.

Dynamic method dispatch -- which form of method to send for execution ---This decision can't be taken by javac --- BUT taken by JRE (JVM)
Achieved via -- method overriding

Method Overriding --- Means of achieving run-time polymorphism

NO "virtual" keyword in java. (i.e all methods are implicitly virtual)

All java methods can be overridden : if they are not marked as private or static or final

Super-class form of method - --- overridden method

sub-class form --- overriding form of the method

Rules : to be followed by overriding method in a sub-class

1. same method name, same signature, ret type must be same or its sub-type(co-variance)

The covariant return type in java, allows narrowing down return type of the overridden method.
This feature will help to avoid down casting in the client's code (eg : Tester).
It allows programmer to program without the need of type checking(i.e instanceof checking) and down casting.
The covariant return type always works only for non-primitive(i.e ref types only!) return types.

eg of co-variance
Can you apply co variance here ?
class Vehicle {
    Vehicle getVehicle()
	{
                    return new Vehicle();
	}
}

class Car extends Vehicle
{
   @Override
   Car  getVehicle()
	{
                    return new Car();
	}
}

eg : Tester 
Car v=new Car();
Car myCar=v.getVehicle();



2. scope---must be same or wider.

3. Will be discussed in exeception handling.
Can not add in its throws clause any new or broader checked exceptions.
BUT can add any new unchecked excs.
Can add any subset or sub-class of checked excs.
class A
{
  void show() throws IOExc
  {...}
}
class B extends A
{
  void show() throws Exc
  {...}
}
Can't add super class of the checked excs.



From JDK 1.5 onwards : Annoations are available --- metadata meant for Compiler or JRE.(Java tools)

Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

Annotations in java are used to provide additional information, so it is an alternative option for XML.

eg @Override,@Deprecated,@SuppressWarnings,@FunctionalInterface


@Override --
Annotation meant  for javac.
Method level annotation ,appearing in a sub class
Optional BUT recommended.
eg :
public class Orange extends Fruit {

@Override
 public void taste() {....}
}
}

While overriding the method --- if you want to inform the compiler that : following is the overriding form of the method use :
@Override
method declaration {...}

Run time polymorphism or Dynamic method dispatch in detail

Super -class ref. can directly refer to sub-class object(direct=w/o type casting) as its the example of up-casting(similar to widening auto. conversion) . 

When such a super class ref is used to invoke the overriding method: which form of the method to send for execution : this decision is taken by JRE & not by compiler. In such case --- overriding form of the method(sub-class version) will be dispatched for exec.

Javac resolves the method binding by the type of the reference & JVM resolves the method binding by type of the object it's referring to.


Super -class ref. can directly refer to sub-class inst BUT it can only access the members declared in super-class -- directly.


eg : A ref=new B(); ref.show()  ---> this will invoke the sub-class: overriding form of the show () method
----------------------------------------------
Applying inheritance & polymorphism 

Important statement
Java compiler resolves method binding by type of the reference & JVM resolves it by the type of the obejct, reference is referring to.


java.lang.Object --- Universal super class of all java classes including arrays.


Object class method
public String toString() ---Rets string representation of object.
Returns --- Fully qualified class Name @ hash code
hash code --internal memory representation.(hash code is mainly used in hashing based data structures -- will be done in Collection framework)

Why override toString?
To replace hash code version by actual details of any object.

Objective -- Use it in  sub classes. (override toString to display Account or Point2D or Emp details or Student / Faculty )
--------------------------

Object class method
public boolean equals(Object o)
Returns true --- If 'this' (invoker ref) & o ---refers to the same object(i.e reference equality) i.e this==o , otherwise returns false.

Need of overriding equals method ?
To replace reference  equality by content identity equality , based upon prim key criteria.

eg : In Car scenario 
(Primary key -- int registration no)

Objective : use it for understanding downcasting n instanceof keyword
------------------------------
instanceof -- keyword in java --used for testing run time type information.

refer : regarding instanceof

Solve 
Fruit f=new Fruit();
f.taste();
f.pulp();
((Mango)f).pulp();
f=new Orange();
f.taste();
((Mango)f).pulp();
if(f instanceof Mango)
 ((Mango)f).pulp();
else
 sop("Invalid fruit....");
if(f instanceof Object)
 ((Mango)f).pulp();
else
 sop("Invalid fruit....");

--------------------------------
abstract : keyword in Java
abstract methods ---methods only with declaration & no definition
eg : public abstract double calNetsalry();
private  abstract double calNetsalry();//javac error


Any time a class has one or multilple abstract methods ---- class must be declared as abstract class.
eg. public abstract class Emp {....}

Abstract classes can't be instantiated BUT can create the reference of abstract class type to refer to concrete sub-class instances.
Emp e1=new Emp(...);//illegal : RHS
Emp e1=new Mgr(....);//legal : provided Mgr class is concrete

Abstract classes CAN HAVE concrete(non-abstract) methods.

Abstract classes MUST provide constructor/s to init its own private data members.(for creating concrete sub class instance)
eg : Emp : empId, dept...: private 
Mgr extends Emp : to init empId, dept ... : MUST supply a constr in Emp class.

Can a class be declared as abstract & final ? NO 

Can an abstract class be crerated with 100% concrete functionality?
Yes 
eg --- Event adapter classes / HttpServlet

Use "abstract" keyword in Emp , Mgr ,Worker hierarchy & test it

final  -- keyword in java 

Usages

1 final data member(primitive types) - constant.
eg -- public final int data=123;

2. final methods ---can't be overridden.
usage eg public final void show{.....} 
This show() method CAN NOT be overridden by any of the sub classes
eg -- Object class -- wait , notify ,notifyAll

3. final class --- can't be sub-classed(or extended) -- i.e stopping inheritance hierarchy.
eg -- String ,StringBuffer,StringBuilder
eg : public class MyString extends String {...} //javac err

4. final reference -- references can't be re-assigned.
eg --final  Emp e=new Mgr(.......);//up casting
         e=new Worker(.....);//compiler err

--------------------
Special note on  protected 

Protected members act as default scope within the same package.
BUT outside pkg -- a sub-class can access it through inheritance(i.e just inherits it directly)  & CAN'T be accessed by creating super class instance.
