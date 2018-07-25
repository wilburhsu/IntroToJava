package Chapter20;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MultipleBounceBall extends Application{

	public void start(Stage primary){
		MultipleBallPane ballPane = new MultipleBallPane();
		ballPane.setStyle("-fx-border-color: yellow");
	}


	private class MultipleBallPane extends Pane {


	}

	class Ball extends Circle{

	}
}

