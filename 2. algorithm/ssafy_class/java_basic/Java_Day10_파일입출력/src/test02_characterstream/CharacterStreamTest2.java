package test02_characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest2 {
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input_copy2.txt")
			){
			
			int c; // reader가 채워준 캐릭터의 개수가 저장됨, 없으면 -1
			int cnt=1;
			char[] buffer = new char[10];
			
			while((c = reader.read(buffer))!= -1){
				writer.write(buffer, 0, c); // 읽어온 개수만큼 출력.
			}
			System.out.println("끝.");
			System.out.println("스트림은 알아서 닫힙니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
