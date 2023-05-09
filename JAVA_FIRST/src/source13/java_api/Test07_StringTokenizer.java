package source13.java_api;

import java.util.StringTokenizer;

// StringTokenizer 클래스는 문자열을 토큰으로 분리하는데 사용하며, 이때 사용되는 토큰은 공백이나 줄바꿈 등 구분자를 사용하여 문자열을 분리 추출함

public class Test07_StringTokenizer {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		
		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) {
			System.out.println("[" + st.nextToken().trim() + "]");
		}
		System.out.println("==========");
		
		String [] tokens = s.split(",");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i].trim());
		}
	}

}
