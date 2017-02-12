import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter the first arg: ");
				String first = reader.next();
				System.out.println("Enter the second arg: ");
				String second = reader.next();
				System.out.println("Enter the operation: +/-/*: ");
				switch (reader.next()) {
					case "+" : calc.add(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result: " + calc.getResult());
						calc.cleanResult();
						break;
					case "-" : calc.diff(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result: " + calc.getResult());
						calc.cleanResult();
						break;
					case "*" : calc.multi(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result: " + calc.getResult());
						calc.cleanResult();
						break;
					default : System.out.println("Operation is not supported");
					break;
				}

				System.out.println("Exit: yes/no");
				exit=reader.next();
			}
		} finally {
			reader.close();
		}
	}
}