package source09_inheritance;

import java.util.Scanner;

class Box {
	private String name;
	
	public Box() {
//		System.out.println("Box() 디폴트 생성자 호출");
	}
	
	// setInfo는 값을 입력하기 위해 생성한 것
	public void setInfo(String name) {
		this.name = name;
//		System.out.println(name);
	}
	
	public void showInfo() {
		System.out.println("박스이름  = " + name);
	}
}

class ColorBox extends Box {
	private String color;
	
	public ColorBox() {
//		System.out.println("ColorBox() 디폴트 생성자 호출");
	}

	@Override
	public void showInfo() {
		System.out.println("컬러 박스 색 = " + color);
	}
	
	public void setColorInfo(String name, String color) {
		super.setInfo(name);
		System.out.println(name);
		this.color = color;
	}
}

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("컬러박스 이름 입력");
		String ColorBoxName = scan.nextLine();
		System.out.println("컬러박스 색상 입력");
		String ColorBoxColor = scan.nextLine();

		ColorBox box = new ColorBox();
		box.setInfo("빛나는 박스");
		
		box.setColorInfo(ColorBoxName, ColorBoxColor);
		box.showInfo();
		scan.close();
	}

}
