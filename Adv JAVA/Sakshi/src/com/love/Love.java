package com.love;

public class Love {
	
	final static class Sakshi {

		private static Sakshi sakshi;

		private static Status status;
		
		static {
			status = Status.ANGRY;
		}

		private Sakshi() { }

		public synchronized static Sakshi propose() {
			if (sakshi == null) {
				sakshi = new Sakshi();
			}
			return sakshi;
		}
		
		public Status getStatus() {
			return status;
		}
	}

	static enum Status {
		HAPPY, SAD, ANGRY, ROMANTIC, FEELING_LOVED
	}

	public static void main(String[] args) {
		Sakshi sakshi = Sakshi.propose();
		while (sakshi.getStatus() != Status.FEELING_LOVED) {
			System.out.println("Sorry Baby, Mazi Shonuli😖😭🥺🥹😓😫");
		}
	}

}
