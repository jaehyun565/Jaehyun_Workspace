package test01_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest3 {
	public static void main(String[] args) {
		// ByteStream을 이용해서 이미지(파일)을 입출력하는 과정.

		// try with resources! 자원을 쓰고 알아서 닫아주는 코드.
		try (FileInputStream fis = new FileInputStream("dog.jpg");
				FileOutputStream fos = new FileOutputStream("dog-copy.jpg");) { // ()안에 내가 사용할 자원들의 스트림 변수를 선언 & 생성.
																				// ; 을 통해 여러 변수 선언 가능.

			int b;

			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사가 완료되었습니다.");
		System.out.println("스트림은 알아서 닫힙니다.");
	}
}
