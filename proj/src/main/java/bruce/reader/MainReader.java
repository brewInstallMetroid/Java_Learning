package bruce.reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainReader {
	public static void main(String[] args) {
		System.out.println("\nEnter full path to text file you would like displayed:");
		Scanner sc = new Scanner(System.in);
		String readPath = sc.nextLine();
		System.out.println("\nREADING FILE...\n");
		try {
			//String readPath = "/Users/brucewayne/Documents/UniDocuments/JavaOOFundamentals/proj/src/main/java/bruce/reader/input.txt";
			BufferedReader br = new BufferedReader(new FileReader(readPath));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("IOException FOUND!!!!!\n" + e.toString() + "\n"); 
		} finally {
			System.out.println("\nDONE!\n\n");
		}
		sc.close();
	}
}
