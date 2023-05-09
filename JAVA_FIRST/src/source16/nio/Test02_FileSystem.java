package source16.nio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Test02_FileSystem {
	public static void main(String[] args) throws Exception {
		FileSystem fileSystem = FileSystems.getDefault();
		for (FileStore store : fileSystem.getFileStores()) {
			// 윈도우즈키 + r - compmgmt.msc - 저장소 - 디스크관리
			// - 디스크0 로컬 디스크 클릭 - 마우스 우클릭 - 속성
			// - 빈공간 있다면 name을 hi01 입력 - 적용 - 확인
			System.out.println("드라이버명 : " + store.name());
			System.out.println("파일시스템 : " + store.type());
			System.out.println("전체 공간 : " + store.getTotalSpace() + "바이트");
			System.out.println("사용 중인 공간 : " + (store.getTotalSpace() - store.getUnallocatedSpace()) + " 바이트");
			System.out.println("사용 가능한 공간 : " + store.getUsableSpace() + " 바이트");
			System.out.println("");
		}
		// 파일 구분자 표시
		System.out.println("파일 구분자 : " + fileSystem.getSeparator());
		System.out.println("");
		
		for (Path path : fileSystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}
}
/* 실행 결과
드라이버명 : hi01
파일시스템 : NTFS
전체 공간 : 239442796544바이트
사용 중인 공간 : 91744976896 바이트
사용 가능한 공간 : 147697819648 바이트

드라이버명 : 
파일시스템 : FAT32
전체 공간 : 249986547712바이트
사용 중인 공간 : 93791354880 바이트
사용 가능한 공간 : 156195192832 바이트

파일 구분자 : \

C:\
D:\
*/
