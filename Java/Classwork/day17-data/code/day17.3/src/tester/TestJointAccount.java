package tester;

import com.app.banking.JointAccount;

import runnable_tasks.BalanceCheckerTask;
import runnable_tasks.BalanceUpdaterTask;

public class TestJointAccount {

	public static void main(String[] args) throws InterruptedException{
		//create SINGLE instance of the joint a/c
		JointAccount acct=new JointAccount(10000);
		/*
		 * create tasks --attach thrds to these tasks --start the same
		 */
		//Thread(Runnable instance ,String name)
		Thread t1=new Thread(new BalanceUpdaterTask(acct), "customer1");
		Thread t2=new Thread(new BalanceCheckerTask(acct), "customer2");
		//start
		t1.start();
		t2.start();
		System.out.println("waiting for child thrds.....");
		t1.join();
		t2.join();
		System.out.println("main over...");
	}

}
