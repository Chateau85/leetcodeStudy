package OldSources._176;

public class _176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "SELECT max(Salary) FROM Employee WHERE Salary < (SELECT max(Salary) FROM Employee)";
		System.out.println(sql);
	}

}
