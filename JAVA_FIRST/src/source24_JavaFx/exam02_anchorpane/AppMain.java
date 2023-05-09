package source24_JavaFx.exam02_anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain 제목");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		 /* AnchorPane을 사용해서 컨트롤을 좌표로 배치하면 윈도우 창이 줄거나 늘어날 경우
        컨트롤의 재배치가 일어나지 않습니다. 따라서, AnchorPane으로 배치할 경우에는
        윈도우 창의 크기를 변경할 수 없도록 Stage의 setResizable(false);메서드를 호출하는 것이 좋습니다. */
		primaryStage.setResizable(false);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
