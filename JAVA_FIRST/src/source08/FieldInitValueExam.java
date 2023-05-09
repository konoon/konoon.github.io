package source08;

public class FieldInitValueExam {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField 자동 초기화 값 : " + fiv.byteField);
		System.out.println("shortField 자동 초기화 값 : " + fiv.shortField);
		System.out.println("intField 자동 초기화 값 : " + fiv.intField);
		System.out.println("longField 자동 초기화 값 : " + fiv.longField);
		System.out.println("booleanField 자동 초기화 값 : " + fiv.booleanField);
		System.out.println("charField 자동 초기화 값 : (빈공백)" + fiv.charField);
		System.out.println("floatField 자동 초기화 값 : " + fiv.floatField);
		System.out.println("arrayField 자동 초기화 값 : " + fiv.arrayField);
		System.out.println("referenceField 자동 초기화 값 : " + fiv.referenceField);

	}

}
