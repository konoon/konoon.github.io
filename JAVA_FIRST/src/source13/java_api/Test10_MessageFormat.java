package source13.java_api;

import java.text.MessageFormat;

public class Test10_MessageFormat {
	public static void main(String[] args) {
		
		String java = "Java";
		int version = 11;
		
		String s = MessageFormat.format("language : {1} \n version : {0}", version, java);
		System.out.println(s);
		
		System.out.println("==============");
		Object [] data = {"파란색", "쏘나타"};
		
		MessageFormat f = new MessageFormat("Car : {1} \n Color : {0}");
		System.out.println(f.format(data));
	}

}
