public class Other {

	private int val;

	public Other(int val) {
		this.val = val;
	}

	public String levelifier(int val, String toReturn) {	
		if (val >= 1500) {
			return "3";
		}
		else {
			StringBuilder sb = new StringBuilder(toReturn);
			int numberOfTwos = 0;
			while (sb.length() < val) {
				for (int i = 0; i < numberOfTwos; i++) {
					sb.append("2");
				}
				sb.append(toReturn);
				numberOfTwos++;
			}
			return sb.toString();
		}
	}

	public String threatLevel(int val) {
		String toReturn = "Midnight";
		String conv = levelifier(val, toReturn).substring(0, Math.abs(val));
		return conv;
	}

	public long defcon(long val) {
		val = (val > 2000) ? 2000 : val;
		if (val > 0) {
			return val + defcon(val - 1);
		} else {
			return val;
		}
	}
}
