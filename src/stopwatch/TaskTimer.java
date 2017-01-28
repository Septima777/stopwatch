package stopwatch;

/**
 * The task that can time when each class has run.
 * 
 * @author Noppawan Kulchol
 *
 */

public class TaskTimer {
	private Stopwatch watch;

	/**
	 * Detemine the taskTimer to be Stopwatch for use some method from
	 * Stopwatch.
	 */
	public TaskTimer() {
		this.watch = new Stopwatch();
	}

	/**
	 * The method that can measure the time when run the task and print the
	 * elapsed time on the console.
	 * 
	 * @param nameTask
	 */
	public void measureAndPrint(Runnable nameTask) {
		System.out.print(nameTask.toString());
		watch.start();
		nameTask.run();
		watch.stop();
		System.out.printf("Elapsed time %.6f sec\n\n", watch.getElapsed());

	}
}
