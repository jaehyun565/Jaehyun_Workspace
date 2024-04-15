package test01_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest2 {
	public static void main(String[] args) {
		// ByteStream을 이용해서 이미지(파일)을 입출력하는 과정.

		// Buffer를 통해서 입출력 해보기.
		try (FileInputStream fis = new FileInputStream("dog2.jpg");
				FileOutputStream fos = new FileOutputStream("dog2-copy.jpg");) { // ()안에 내가 사용할 자원들의 스트림 변수를 선언 & 생성.
																				// ; 을 통해 여러 변수 선언 가능.

			// buffer을 사용하면 반환되는 b의 의미가 바뀐다.
			int b; // 읽어온(채워준 바이트)개수가 들어감.(못 읽어왔다면 -1)

			byte[] buffer = new byte[10];

			while ((b = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사가 완료되었습니다.");
		System.out.println("스트림은 알아서 닫힙니다.");
	}
}
