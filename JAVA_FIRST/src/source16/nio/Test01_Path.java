package source16.nio;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Test01_Path {
	public static void main(String[] args) {

		Path path = Paths.get("source16/io/Teat08_FileDelete.java");
		System.out.println("[파일명] " + path.getFileName());
		System.out.println("[부모 디렉토리명]: " + path.getParent().getFileName());
		System.out.println("중첩 경로수 : " + path.getNameCount());
		
		System.out.println("\n===[for문 활용] ===");
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
		System.out.println("\n===[iterator 활용] ===");
		Iterator<Path> iterator = path.iterator();
		while (iterator.hasNext()) {
			Path path2 = (Path) iterator.next();
			System.out.println(path2.getFileName());
		}
	}
}
