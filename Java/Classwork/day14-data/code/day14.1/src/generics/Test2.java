package generics;

import static utils.GenericUtils.computeSalarySum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import com.app.core.Mgr;
import com.app.core.TempWorker;

import fruits.Fruit;
import fruits.Mango;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Mgr> mgrs=new ArrayList<>();
		mgrs.add(new Mgr(5000));
		mgrs.add(new Mgr(6000));
		mgrs.add(new Mgr(7000));
		System.out.println(computeSalarySum(mgrs));
		Vector<TempWorker> workers=new Vector<>();
		workers.add(new TempWorker(2345));
		workers.add(new TempWorker(6345));
		System.out.println(computeSalarySum(workers));
		LinkedList<Fruit> fruits=new LinkedList<>();
		fruits.add(new Mango());
	//	System.out.println(computeSalarySum(fruits));
		

	}

}
