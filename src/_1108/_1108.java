package _1108;

public class _1108 {

	public static void main(String[] args) {
		//String address = "1.1.1.1";
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
	}

	private static String defangIPaddr(String address) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				sb.append("[.]");
			} else {
				sb.append(address.charAt(i));
			}
		}
		return sb.toString();
	}

}
