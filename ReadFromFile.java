import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {

		File file = new File("test.txt");
		File fileArr[] = new File[20];
		try {

			Scanner sc = new Scanner(file);

			while (sc. hasNextLine())
				System.out.println(sc.nextLine());
		} catch (IOException ex) {

			ex. printStackTrace();
			System.exit(1);

		}
	}
}
