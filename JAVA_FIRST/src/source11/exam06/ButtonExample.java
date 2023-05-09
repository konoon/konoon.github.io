package source11.exam06;

public class ButtonExample  {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListenter());
		btn.touch();
		
		btn.setOnClickListener(new MessageListenter());
		btn.touch();
	}

}
