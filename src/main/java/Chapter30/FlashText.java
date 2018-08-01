package Chapter30;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FlashText extends Application{
	private String text = "";

	@Override
	public void start(Stage primaryStage){
		StackPane pane = new StackPane();
		Label labelText = new Label("Programming is fun");
		pane.getChildren().add(labelText);

		new Thread(new Runnable() {
			@Override
			public void run() {
				try{
					for(int i = 0;i<100;i++){
						if(labelText.getText().trim().length() == 0){
							//System.out.println("<--------->" + i);
							text = "Welcome";
						}
						else{
							System.out.println("<--------->" + i);
							text = "";
						}

						Platform.runLater(new Runnable() {	//Run from JavaFX GUI
							@Override
							public void run() {
								labelText.setText(text);
							}
						});

						Thread.sleep(200);
					}
				}catch (InterruptedException ex){

				}
			}
		}).start();

		Scene scene = new Scene(pane,500,50);
		primaryStage.setTitle("FlashText");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
