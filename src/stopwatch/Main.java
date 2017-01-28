package stopwatch;

public class Main {
	public static void main(String[] args) {
		TaskTimer timer = new TaskTimer();
		int num1 = 50000;
		int num2 = 100000;
		int num3 = 5000000;
		int num4 = 1000000000;
		timer.measureAndPrint(new AppendToString(num1));
		timer.measureAndPrint(new AppendToString(num2));
		timer.measureAndPrint(new AppendToString(num3));
		timer.measureAndPrint(new AppendToStringBuilder(num1));
		timer.measureAndPrint(new AppendToStringBuilder(num2));
		timer.measureAndPrint(new AppendToStringBuilder(num3));
		timer.measureAndPrint(new SumDoublePrimitive(num3));
		timer.measureAndPrint(new SumDoublePrimitive(num4));
		timer.measureAndPrint(new SumDouble(num3));
		timer.measureAndPrint(new SumDouble(num4));
		timer.measureAndPrint(new SumBigDecimal(num3));
		timer.measureAndPrint(new SumBigDecimal(num4));

	}

}

