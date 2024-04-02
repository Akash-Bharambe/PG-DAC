# Java

- Java is high-level, statically type checked, Object-oriented as well as Functional programming language.
- Java is Compiled as well as Interpreted, Fully encapsulated Language, i.e. everything is written in classes.
- Java language is both technology as well as platform.
- Code name of the Java was **“Green”** Project.
- Java was developed by **(“Green Team”)** **James Gosling, Patrick Naughton, Chris Warth, Ed Frank, and Mike Sheridan at Sun Microsystems**, which was later acquired by Oracle Corporation(2010).
- The name "Green" was chosen because the team wanted to emphasize that their goal was to create an environmentally-friendly language that would allow programs to run efficiently on a variety of devices, including small handheld devices and large servers.
- Green Team started working on **“Green Project” in 1991** and first public version released in 1996.
- In fact, the original name for Java was **"Oak"**, but it was changed to **"Java"** because another company had already registered the name "Oak" for their product.
- Java's slogan is **"Write Once, Run Anywhere"** (sometimes abbreviated as "WORA").
- The standardization of the Java language is overseen by the Java Community Process (JCP).
- **“\*7”** is the first project delivered by Green Team.
- An extremely intelligent TV remote control.

## Java Code Names

- Code names are used by developers and companies to refer to different versions of Java during the development process.

1. JDK 1.1: Sparkler
2. J2SE 1.2: Playground
3. J2SE 1.3: Kestrel
4. J2SE 1.4: Merlin
5. J2SE 5.0: Tiger
6. Java SE 6: Mustang
7. Java SE 7: Dolphin
8. **Java SE 8: Spider**
9. Java SE 9: Project Jigsaw
10. Java SE 10: Project Valhalla
11. **Java SE 11: Project Amber**
12. Java SE 12: Project Skara
13. Java SE 13: Project ZGC
14. Java SE 14: Project Panama
15. Java SE 15: Project Loom
16. Java SE 16: Project Metropolis
17. **Java SE 17: Project Panama 2.0**

## JLS & JSR

- JLS stands for **Java Language Specification.**
- It is a document that defines the syntax, semantics, and behavior of the Java programming language.
- Reference: https://docs.oracle.com/javase/specs/
- JSR stands for **Java Specification Request.**
- It is a formal proposal for adding new features or making changes to the Java platform.
- JSRs are submitted by individuals, organizations, or companies to the Java Community Process (JCP) for review and approval.
- Reference: https://jcp.org/en/jsr/detail?id=336

## Editions of Java Platform

1. **Java SE**
   - Java Standard Edition( also called as **Core Java**)
   - It is designed for developing and running desktop, server, and standalone applications.
   - It includes the core Java API and provides a foundation for building Java applications.
2. **Java EE**
   - Java Enterprise Edition( also called as **Web / Advanced / Enterprise Java** )
   - It is designed for building web applications and web services.
   - It includes the Java Servlet API, Java Server Pages (JSP), and Enterprise JavaBeans (EJB).
3. **Java ME**
   - Java **Micro** Edition.
   - It is designed for developing applications for resource-constrained devices such as mobile phones, PDAs, and other embedded systems.
   - It includes a subset of the Java SE APIs and provides a smaller footprint than Java SE.
4. **Java Card**
   - It is designed for building **smart card applications.**
   - It includes a subset of the Java ME APIs and provides security and cryptographic features for smart card applications.

## Software Development Kit

- **SDK = Development Tools + Documentation + Supporting Libraries + Execution Environment.**

### JDK

- **JDK = Java Development Tools + Java Docs + jrt-fs.jar + Java Virtual Machine.**
- Java Development Tools: javac, java, javap, javadoc, etc.
- Java Docs: HTML pages, which contains help of Core Java API
- rt.jar: It contains core Java API
- Java Virtual Machine: It is abstract computer which manages execution of bytecode.
- JDK is a platform dependent software that we can download from oracle site.
- Developer must install JDK to develop Java application.

![JDK vs JRE vs JVM](https://i.imgur.com/WNj92Kw.png)

### JRE

- **JRE = jrt-fs.jar + Java Virtual Machine.**
- JRE is platform dependent software that we can download from oracle site.
- To run Java application on Client’s machine we must install/deploy JRE.
- JVM = Java Virtual Machine
- Java Compiler provides intermediate bytecode, this bytecode is platform independent. The JVM is responsible for interpreting this bytecode and translating it into machine code that is platform independent. It also provides memory management, security, and other runtime services necessary for executing Java applications.
- Reference: https://www.oracle.com/in/java/technologies/downloads/

## WHY Java ?

1. Platform or architecture independent (Write once run anywhere!)
2. Simple & robust
3. Secure
4. Automatic memory management.
5. Inherent Multi threaded support
6. Object Oriented support -- Encapsulation,Inheritance & polymorphism , abstraction
7. Excellent I/O support
8. Inherent networking support for TCP/IP , UDP/IP programming & for URLs
9. Supports Functional programming
   And many more .

## Contents of package

- Sub package
- Interface
  - Nested Type
  - Constant Fields
  - Abstract Methods
  - Default Methods
  - Static Interface Methods
- Class
  - Nested Types( Interface / Class / Enum )
  - Fields
  - Constructor
  - Method
- Enum
- Exception
- Error
- Annotation Type

## Modifiers in Java

- PUBLIC
- PRIVATE
- PROTECTED
- STATIC
- FINAL
- SYNCHRONIZED
- VOLATILE
- TRANSIENT
- NATIVE
- INTERFACE
- ABSTRACT
- STRICT
- Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Modifier.html

## Access Modifiers

- Modifiers which are used to control visibility of members of the class is called access modifier.
- **private:** visible within the same class
- **Package level private( also called as default ):** no access modifier, visible within same package
- **protected:** accessible withing the same package & accessible to sub classess via inheritance
- **public:** accessible from anywhere.

- Legal class level access specifiers.
    1. default(scope=current package only)
    2. public (scope=accessible form any where)

## `main` method

- In java, main method is considered as entry point method.
- With the help of main thread, JVM invoke main method.
- Syntax:
  - `public static void main(String args[] )`
  - `public static void main(String[] args )`
  - `public static void main(String... args )`
- We can define main method inside class as well as interface.

```java
public class Program{
 public static void main(String[] args ) {
 System.out.println("Hello World!!!");
 }
}
```

```java
interface Program{
 public static void main(String[] args ) {
 System.out.println("Hello World!!!");
 }
}
```

## What is System.out.println?

```java
package java.lang;
public final class System {
 //Fields
 public final static InputStream in = null;
 public final static PrintStream out = null;
 public final static PrintStream err = null;
```

- `System` : Final Class of java.lang Package.
- `out` : Public Static Final Field of `System` Class. Reference of java.io.PrintStream class.
- `System.out` represents standard output.

```java
 //How will you access in
 System.in //It reprsents keyboard
 //How will you access out
 System.out //It represents Monitor
 //How will you access err
 System.err //It represents Monitor for errors
```

- PrintStream is a class declared in java.io package.

```java
package java.io;
public class PrintStream extends FilterOutputStream implements Appendable, Closeable{
public void print(boolean);
public void print(char);
public void print(int);
public void print(long);
public void print(float);
public void print(double);
public void print(char[]);
public void print(String);
public void print(Object);
public void println();
public void println(boolean);
public void println(char);
public void println(int);
public void println(long);
public void println(float);
public void println(double);
public void println(char[]);
public void println(String);
public void println(Object);
public PrintStream printf(String, Object...);
public PrintStream printf(Locale, String, Object...);
}
```

### print, println and printf

`println()/print()/printf()` are non static methods of PrintStream class.

- System.out.print method print output on console but it keeps cursor on same line.

```java
class Program{
 public static void main1(String[] args ) {
 System.out.print("Hello ");
 System.out.print(" World");
 System.out.print("!!");
 }
}
```

- System.out.println method print output on console but it moves cursor to the next line.

```java
class Program{
 public static void main(String[] args ) {
 System.out.println("Hello ");
 System.out.println(" World");
 System.out.println("!!");
 }
}
```

- To print formatted output on console / terminal, we should use printf method.

```java
 public static void main(String[] args) {
 String name1 = "Akash Bharambe";
 int empid1 = 10003778;
 float salary1 = 45000.50f;
 String name2 = "Bharambe Akash";
 int empid2 = 3779;
 float salary2 = 125000.50f;
 System.out.printf("%-20s%-10d%-10.2f\n", name1, empid1,salary1);
 System.out.printf("%-20s%-10d%-10.2f\n", name2, empid2,salary2);
 }
```

## Compiling java code

**Steps (without IDE)**

1. Create a folder under Java workspace(workspace is the folder created for storing java code)
   - eg : day1
2. Create 2 sub folders : src n bin
   - src : for Java src files
   - bin : for .class files
3. Write Java src file under src.
4. How to compile ?

Open cmd prompt in a folder where .java file is saved.
`javac -d ..\bin HelloWorld.java`

5. How to run/launch java program(application) ?
   `cd ..\bin`
   `java HelloWorld`
