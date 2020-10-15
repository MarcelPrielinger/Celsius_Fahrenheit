package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*******************************
 * @author Marcel Prielinger
 * @version 1 / 20.4.2020
 *******************************/

public class Main extends Application {

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();



        Scene scene = new Scene(root, 300, 635);
        stage.setTitle("Memory");
        stage.setScene(scene);
        stage.show();
    }
}
