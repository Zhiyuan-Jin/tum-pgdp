package pgdp;

/**
 * This class provides convenience methods to make the barrier of entry into
 * programming easier.
 */
public class PinguLib {

	/**
	 * Prints the {@link String} to the console and breaks the line.
	 */
	public static void write(String output) {
		System.out.println(output);
	}

	/**
	 * Prints the <code>int</code> to the console and breaks the line.
	 */
	public static void write(int output) {
		write(String.valueOf(output));
	}

	/**
	 * Prints the <code>double</code> to the console and breaks the line.
	 */
	public static void write(double output) {
		write(String.valueOf(output));
	}

	/**
	 * Identical to {@link #write(String)}.
	 */
	public static void writeLineConsole(String output) {
		System.out.println(output);
	}

	/**
	 * Identical to {@link #write(int)}.
	 */
	public static void writeLineConsole(int output) {
		writeLineConsole(String.valueOf(output));
	}

	/**
	 * Identical to {@link #write(double)}.
	 */
	public static void writeLineConsole(double output) {
		writeLineConsole(String.valueOf(output));
	}

	/**
	 * Prints a line separator in the console.
	 */
	public static void writeLineConsole() {
		writeLineConsole("");
	}

	/**
	 * Prints the {@link String} to the console. Does not end with a line break.
	 */
	public static void writeConsole(String output) {
		System.out.print(output);
	}

	/**
	 * Prints the <code>int</code> to the console. Does not end with a line break.
	 */
	public static void writeConsole(int output) {
		writeConsole(String.valueOf(output));
	}

	/**
	 * Prints the <code>double</code> to the console. Does not end with a line
	 * break.
	 */
	public static void writeConsole(double output) {
		writeConsole(String.valueOf(output));
	}

}
