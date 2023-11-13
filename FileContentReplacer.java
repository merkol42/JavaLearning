import java.io.*;
import java.nio.file.*;
import java.util.stream.*;


/**
 * change file content
 */
public class FileContentReplacer {
	public static void main(String[] args) {
		replaceInFiles("oldWord", "newWord", Paths.get("."));
	}

	public static void replaceInFiles(String oldWorld, String newWord, Path rootPath) {
		try {
			Files.walk(rootPath)
					.filter(Files::isRegularFile)
					.filter(p -> p.toString().endsWith(".java"))
					.forEach(file -> replaceInFile(file, oldWorld, newWord));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void replaceInFile(Path file, String oldWorld, String newWord) {
		try {
			String content = new String(Files.readAllBytes(file), "UTF-8");
			content = content.replaceAll(oldWorld, newWord);
			Files.write(file, content.getBytes("UTF-8"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}