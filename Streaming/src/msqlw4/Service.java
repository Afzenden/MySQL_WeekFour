package msqlw4;

import java.util.NoSuchElementException;

public class Service {
	private OptionalDao dao = new OptionalDao();

	public String find(String search) {
		return dao.find(search).orElseThrow(() -> new NoSuchElementException(
				"It appears that " + search + " is missing."));
	}

}
