package Chapter8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample8_3 {
	public static void main(String[] args) throws IOException {

		Path path=Paths.get("c:\\training\\write.txt");
		BufferedWriter bw=Files.newBufferedWriter(path);

		bw.write("おはようございます");

		BufferedWriter writer=Files.newBufferedWriter(Paths.get("c:\\training\\write.txt"));

		writer.write("ごりら");
		writer.newLine();
		writer.write("おさるのモンチッチ");
		writer.newLine();
		writer.write("getName山田源之助");
		writer.close();

	}
}
