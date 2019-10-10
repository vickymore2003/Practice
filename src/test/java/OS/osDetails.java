package OS;

public class osDetails {

	public static void main(String args[]) {
		osDetails os = new osDetails();
		String OSName = null;

		System.out.println(os.getOS(OSName));
	}

	public String getOS(String OSName) {
		OSName = System.getProperty("os.name");
		return OSName;
	}

}
