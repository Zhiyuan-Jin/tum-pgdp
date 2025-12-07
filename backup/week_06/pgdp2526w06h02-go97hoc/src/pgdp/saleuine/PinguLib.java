package pgdp.saleuine;

import java.util.Random;

public class PinguLib {

	private static Random rand;

	/**
	 * Returns a random integer in the range minval (inclusive) to maxval
	 * (inclusive)
	 * <p>
	 * <i>Gibt eine zufällige Zahl zwischen minval (inklusive) bis maxval
	 * (inklusive) zurück.</i>
	 */
	public static int randomInt(int minval, int maxval) {
		if (rand == null) {
			setRandom();
		}
		return minval + rand.nextInt(maxval - minval + 1);
	}

	public static void setRandom() {
		setRandomWithSeed(42, null);
	}

	public static void resetRandom(Random oldRandom) {
		if (rand != null && rand != oldRandom) {
			throw new SecurityException("Don't use resetRandom()!");
		}
		rand = null;
	}

	public static Random setRandomWithSeed(int seed, Random oldRandom) {
		if (rand != null && rand != oldRandom) {
			throw new SecurityException("Don't use setRandom()!");
		}
		rand = new Random(seed);
		return rand;
	}
}
