package stopwatch;

/**
 * The task that add chars to String.
 * 
 * @author Noppawan Kulchol
 *
 */

public class AppendToString implements Runnable {
	private int count;
	private String result;

	/**
	 * Detemine the default value of each variables in AppendToString class.
	 * 
	 * @param count
	 *            is the length of final string.
	 */
	public AppendToString(int count) {
		this.result = "";
		this.count = count;
	}

	/**
	 * The method that add char 'a' to String until it equals count and print it
	 * on the console
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}
		System.out.printf("final String lenght = %d\n",result.length());
	}
	
	

	/**
	 * Print the details of the task on the console
	 * 
	 * @return The details of the Task
	 */
	@Override
	public String toString() {
		return String.format("Append %,d chars to String\n", count);
	}
}
