package _657;

public class _657 {

	public static void main(String[] args) {
		//String moves = "UD";
		//String moves = "LL";
		String moves = "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL";
		System.out.println(judgeCircle(moves));
	}

	private static boolean judgeCircle(String moves) {
		int[] direction = new int[4];
		for (int i = 0; i < moves.length(); i++) {
			if (moves.charAt(i) == 'U') {
				direction[0]++;
			} else if (moves.charAt(i) == 'D') {
				direction[1]++;
			} else if (moves.charAt(i) == 'R') {
				direction[2]++;
			} else if (moves.charAt(i) == 'L') {
				direction[3]++;
			}
		}
		if (direction[0] == direction[1] && direction[2] == direction[3]) {
			return true;
		} else {
			return false;
		}
	}

}
