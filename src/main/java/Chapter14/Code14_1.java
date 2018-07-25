package Chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by Wilbur Hsu on 2017-12-28.
 * MyJavaFX
 */
public class Code14_1 extends Application{
    public void start(Stage primtyStage){
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK,200,250);
        primtyStage.setTitle("MyJavaFX");
        primtyStage.setScene(scene);
        primtyStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
