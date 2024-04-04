package p2;
import p1.A;
class D extends A{
D() {
	//super();javac impl invokes immediate super cls's ctor
  System.out.println("D's state "+i+" "+j+" "+k+" "+l);
}
}