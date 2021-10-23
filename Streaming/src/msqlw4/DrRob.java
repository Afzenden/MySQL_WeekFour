package msqlw4;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class DrRob {

	private static Scanner scanner = new Scanner(System.in);
	// private static Service service = new Service();

	public static void main(String[] args) {

		run();

	}

	static void run() {
		boolean done = false;

		while (!done) {
			System.out.print("Enter Something");
			String search = scanner.nextLine();

			if (search.isEmpty()) {
				done = true;
			} else {
				try {
					String found = find(search);
					System.out.println("I found " + found + "!");
				} catch (NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public static String find(String search) {
		return finddata(search)
				.orElseThrow(() -> new NoSuchElementException("It appears that " + search + " is missing."));
	}

	public static Optional<String> finddata(String search) {
		if ("missing".equals(search)) {
			return Optional.empty();
		}

		return Optional.of(search);

	}

}
