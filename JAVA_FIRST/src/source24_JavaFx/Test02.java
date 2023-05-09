package source24_JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test02 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("JavaFx로 실행함");
		
		FlowPane pane = new FlowPane();
		pane.getChildren().add(label);
		
		Scene scene = new Scene(pane, 320, 240);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
