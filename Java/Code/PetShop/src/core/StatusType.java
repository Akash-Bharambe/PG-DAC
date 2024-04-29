package core;

/**
 * 
 */
public enum StatusType {
	PLACED, IN_PROCESS, COMPLETED;

	/**
	 * Overriden method of java.lang.Enum class to get String representation of Status
	 * 
	 * @return name of status with natural numerical order
	 */
	@Override
	public String toString() {
		return (this.ordinal() + 1) + ". " + this.name();
	}
}
