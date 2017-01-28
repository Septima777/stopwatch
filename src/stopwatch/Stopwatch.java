package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Noppawan Kulchol
 * @version 1.0
 */
public class Stopwatch {
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stopTime;
	/** time that the stopwatch is running, in nanoseconds. */
	private boolean isRunning;

	/**
	 * Detemine the status of isRunning to be false.
	 */
	public Stopwatch() {
		this.isRunning = false;
	}

	/** Start the stopwatch if it is not already running. */
	public void start() {
		if (isRunning == false) {
			startTime = System.nanoTime();
			isRunning = true;
		}

	}

	/** Stop the stopwatch if it is already running. */
	public void stop() {
		if (isRunning == true) {
			stopTime = System.nanoTime();
			isRunning = false;
		}

	}

	/**
	 * Record the time both current time and when stop time.
	 * 
	 * @return Elapsed time when we run the task.
	 */
	public double getElapsed() {
		if (isRunning == true) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * Detemine status of stopwatch.
	 * 
	 * @return True when it's running,False when it isn't running.
	 */
	public boolean isRunning() {
		if (isRunning == true) {
			return true;
		} else {
			return false;
		}

	}

}
