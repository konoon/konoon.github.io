package source13;

import source08.Car;

public class ResourcePathExample {
	public static void main(String[] args) {

	Class cs = Car.class;
	String image1Path = cs.getResource("icon1.jpg").getPath();
	System.out.println(image1Path);
	
	String image2Path = cs.getResource("images/icon3.jpg").getPath();
	System.out.println(image2Path);
	}

}
