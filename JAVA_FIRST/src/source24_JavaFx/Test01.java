package source24_JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test01 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("하이 JavaFx로 실행함");
		
		BorderPane pane = new BorderPane();
		
		pane.setCenter(label);
		
		Scene scene = new Scene(pane, 320, 240);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
