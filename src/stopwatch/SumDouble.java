package stopwatch;

/**
 * The task that add Double (be object) in the array.
 * 
 * @author Noppawan Kulchol
 *
 */

public class SumDouble implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;

	/**
	 * Detemine the default value of counter
	 * 
	 * @param counter
	 *            is times that can add number.
	 */
	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * The method that can add Double in the array from 1 to ARRAY_SIZE and set it
	 * to 1 when it puts over the ARRAY_SIZE.
	 */
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		Double sum = new Double(0.0);
		// count = loop counter, i = array index
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
		System.out.println("sum = "+sum);
	}

	/**
	 * Print the details of the task on the console.
	 * 
	 * @return The details of the task.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\n", counter);

	}

}

