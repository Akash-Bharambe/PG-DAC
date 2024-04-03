//All java classes implicitly import a package(=collection //of java classes) java.lang
//import java.lang.*;

class HelloWorld {
  public static void main(String[] args) 
  {
  //System : class from java.lang package
  // out : static data member of System class
  //data type of out : java.io.PrintStream
  //System.out => std o/p stream
  //println/print/printf : method of PrintStream class
  //
    System.out.println("Welcome 2 Java !!!!");
	System.out.println("Hello ,"+args[0]);
  }
}