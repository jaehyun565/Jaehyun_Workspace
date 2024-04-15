package test01_bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest1 {
	public static void main(String[] args) {
		// ByteStream을 이용해서 이미지(파일)을 입출력하는 과정.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("cat.jpg");
			fos = new FileOutputStream("cat-copy1.jpg");

			int b; // File로부터 읽어올 데이터를 임시저장
			
			// 한 바이트씩 저장되고, 더 이상 읽을 값이 없으면 -1이 저장
			while ((b = fis.read()) != -1) { // 한 바이트씩 읽어와서, 걔가 -1이 아니라면 계속 실행
				// b에 바이트를 하나 읽어왔고, 애를 핸들링							
				fos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// fis, fos 가 finally에 왔을 때, 위에서 예외처리가 됐다면? null 일 수가 있음
				if (fis != null) { // null 이 아닐때만 close작업 실행
					fis.close();
				}

				if (fos != null) {
					fos.close();
				}
				System.out.println("Stream이 닫혔습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		// Stream을 썼으면 닫아줘야 한다!
		System.out.println("복사가 완료되었습니다.");
	}
}
