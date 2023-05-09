package source24_JavaFx.exam09_fxml_controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

// FXML 컨트롤러(Controller) 사용
// 프로그램적 레이아웃은 레이아웃 코드와 이벤트 처리 코드를 모두 자바 코드로 작성해야 하므로
// 코드가 복잡해지고, 유지보수도 힘들어지며, 디자이너와 협력해서 개발하는 것도 쉽지 않습니다.
// FXML 레이아웃은 FXML 파일당 별도의 컨트롤러(Controller)를 지정해서 이벤트를 처리할 수
// 있기 때문에 FXML 레이아웃과 이벤트 처리 코드를 완전히 분리할 수 있습니다.

// 컨트롤러는 다음과 같이 Initializable 인터페이스를 구현한 클래스로 작성하시면 됩니다.
public class RootController implements Initializable {
	
	// root.fxml의 fx:id 속성을 가진 컨트롤러들은 컨트롤러의 @FXML 어노테이션이 적용된
	// 필드에 자동 주입됩니다. 여기서 주의할 점은 fx:id 속성값과 필드명은 반드시 동일해야 합니다.
	// FXMLLoader가 FXML 파일을 로딩할 때, 태그로 선언된 컨트롤러 객체가 생성되고,
	// 아울러 컨트롤러 객체도 함께 생성됩니다. 그리고 나서 @FXML 어노테이션이 적용된 필드에
	// 컨트롤러 객체가 자동 주입됩니다. 주입이 완료되면 비로소 initialize() 메서드가 호출되기
	// 때문에 initialize() 메서드 내부에서 필드를 안전하게 사용할 수 있습니다.
	@FXML
	private Button btn1;
	
	@FXML
	private Button btn2;

	@FXML
	private Button btn3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// EventHandler 등록 : 컨트롤러에서 발생하는 이벤트를 처리하려면 컨트롤러의
		//                   initialize() 메서드에서 EventHandler를 생성하고
		//                   등록해야 합니다.
		// 그리고, 다음 세개의 Button에서 발생하는 ActionEvent를 처리해 줍니다.
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
			}
		});

		// 람다식 이용 등록 활용
		btn2.setOnAction(event -> handleBtn2Action(event));
		
		// 람다식 이용 등록 활용
		btn3.setOnAction(event -> handleBtn3Action(event));
		
	}

	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3 클릭!");
	}

	// EventHandler 생성 및 등록 : 컨트롤러에서 발생하는 이벤트 처리(메소드 매핑)
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2 클릭!");
	}

	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1 클릭!");
	}
}
