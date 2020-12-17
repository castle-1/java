package java_20_12_16;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoException {

	public static void main(String[] args) {
	
		
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('B');
			
			if(writer != null) {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
