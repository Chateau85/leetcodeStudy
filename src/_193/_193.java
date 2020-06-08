package _193;

public class _193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command = "grep -P '^(\\d{3}-|\\(\\d{3}\\) )\\d{3}-\\d{4}$' file.txt";
		// Strint commandAnother = "sed -n -r '/^([0-9]{3}-|\([0-9]{3}\)
		// )[0-9]{3}-[0-9]{4}$/p' file.txt"
		System.out.println(command);
	}

}
