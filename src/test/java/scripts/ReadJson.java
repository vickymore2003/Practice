package scripts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class ReadJson {

	public static void main(String[] args) throws IOException {
		String job= getJsonValue("$.Job.Job");
		String	age = getJsonValue("$.Age.lname");
		System.out.println(job);
		System.out.println(age);
	}

	public static String getJsonValue(String jsonPath) throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Json\\test.json";
		String jsonString = new String(Files.readAllBytes(Paths.get(path)));
		String value = JsonPath.read(jsonString, jsonPath);
		return value;
	}
}
