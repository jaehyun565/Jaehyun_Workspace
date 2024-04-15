package test02_characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest1 {
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input_copy1.txt")
			){
			
			int c;
			
			while((c = reader.read())!= -1){
				writer.write(c);
			}
			System.out.println("끝.");
			System.out.println("스트림은 알아서 닫힙니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
