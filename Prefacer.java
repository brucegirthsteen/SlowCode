public class Prefacer {

	public static String nirp = "";

	public static void preface(int q) {
		int flux = 1;

		char nextChar = 'A';
		char backupChar = 'M';
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			nextChar += (int) ((Math.sqrt(nextChar) * 12) + (nextChar / 3) - (Math.sqrt(nextChar + 1))
					+ (int) (Math.acos((double) nextChar) * Math.atan((double) nextChar))
					- ((short) Math.cbrt((double) nextChar + 2))) - 70 - 39 - ((int) flux);
			nextChar++;
			// System.out.println("**" + (int) nextChar + "**");
			if (nextChar > 'Z' || nextChar < ' ') {
				nextChar = backupChar++;
				if (backupChar > 'Z') {
					backupChar = 'A';
				}
			}
			sb.append(nextChar);
		}
		nirp = sb.toString();
	}
}
