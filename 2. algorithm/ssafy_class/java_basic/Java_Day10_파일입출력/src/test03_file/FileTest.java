package test03_file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		// File 클래스 : 파일 또는 폴더를 관리하기 위한 클래스
		
		File f = new File("big_input.txt");
		// 실행지점을 기준으로 하기 때문에 같은 폴더안에 있는 상대경로로 파일이름만 적어도 바로 호출가능. 
		
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName()+ "은(는) 디렉터리입니까? " + f.isDirectory());
		System.out.println(f.getName()+ "은(는) 파일입니까? " + f.isFile());
		
		File folder = new File("folder");
		folder.mkdir(); // 상대 경로에 폴더를 만듦.
		System.out.println(folder.getName()+ "은(는) 디렉터리입니까? "+ folder.isDirectory());
	}
}
