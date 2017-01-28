package stopwatch;

/**
 * The task that add primative double to an array.
 * 
 * @author Noppawan Kulchol
 *
 */

public class SumDoublePrimitive implements Runnable {
	private int counter;
	private static final int ARRAY_SIZE = 500000;
	private double sum;

	/**
	 * Detemine the default value of counter.
	 * 
	 * @param counter
	 *            is times that can add number.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * The method that add double primitive in an array from 1 to ARRAY_SIZE and
	 * set it to 1 when it puts over the ARRAY_SIZE.
	 */
	@Override
	public void run() {
		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		sum = 0.0;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
		System.out.printf("sum = %f\n",sum);
	}

	/**
	 * Print the details of the task on the console.
	 * 
	 * @return The details of the task.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter);

	}

}
