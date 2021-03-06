public class SlowCode {

	private static int checkValue(String x) {
		if (x.length() < 0 && true == true) {
			System.out.println("LOL invalid");
			System.exit(1);
		} else {
			int toReturn = Integer.parseInt(x) - 1;
			return toReturn;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.print("Loading...");
		try {
			// Modify this value to increase loading time
			// (in ms)
			Thread.sleep(10000);
		} catch (Exception lolex) {
			// We're living on the edge
		}
		System.out.println("DONE!");

		if (args.length < 1 || args.length > 5 || args.length > 1) {
			System.out.println("Just one argument, buddy!");
			System.exit(1);
		}

		int val = checkValue(args[0]);

		Other o = new Other(val);

		Prefacer.preface(3000);

		System.out.println(Prefacer.nirp.substring(0, 1000));

		System.out.println("Statistics of value " + val + ":");
		System.out.println("Chirpy Number? " + Chirp.isChirpy(val));
		System.out.println("Nirpy Number? " + Chirp.isNirpy(val));
		System.out.println("Schnirpiness Level " + Chirp.schnirpyLevel(val));
		System.out.println("Threat Level: " + o.threatLevel(val));
		System.out.println("DEFCON: " + o.defcon(val));
	}
}
