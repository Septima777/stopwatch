package stopwatch;

/**
 * The task that add chars to StringBuilder.
 * 
 * @author Noppawan Kulchol
 *
 */

public class AppendToStringBuilder implements Runnable {
	final char CHAR = 'a';
	private int count;
	private String result;

	/**
	 * Detemine the default value of each variables in AppendToStringBuilder
	 * class.
	 * 
	 * @param count
	 *            is the length of final String.
	 */
	public AppendToStringBuilder(int count) {
		this.result = "";
		this.count = count;
	}

	/**
	 * The method that add char 'a' to StringBuilder until it equals count and
	 * print it on the console.
	 */
	@Override
	public void run() {
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {
			builder = builder.append(CHAR);
		}
		result = builder.toString();
		System.out.printf("final string length = %d\n",result.length());
	}

	/**
	 * Return the details of the task on the console.
	 * 
	 * @return The details of the task.
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\n", count);

	}

}
