package core;

public enum StatusType {
	PLACED, IN_PROCESS, COMPLETED;

	@Override
	public String toString() {
		return (this.ordinal() + 1) + ". " + this.name();
	}
}
