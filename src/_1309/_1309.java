package _1309;

public class _1309 {

	public static void main(String[] args) {
		//String s = "10#11#12";
		//String s = "1326#";
		String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
		System.out.println("abcdefghijklmnopqrstuvwxyz".equals(freqAlphabets(s)));
	}

	private static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == '#') {
				int temp = (s.charAt(i-2) - 48) * 10 + (s.charAt(i-1) - 48);
				sb.append((char)(temp+96));
				i = i-2;
			}else {
				sb.append((char)(s.charAt(i)+48));
			}
		}
		return sb.reverse().toString();
	}

}
