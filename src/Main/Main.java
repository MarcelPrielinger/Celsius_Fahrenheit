package Main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
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

        VBox root = new VBox();

        Label celsiusText = new Label("Celsius");
        Label fahrenheitText = new Label("Fahrenheit");

        TextArea celsius = new TextArea();
        celsius.setMaxHeight(1);
        celsius.setMaxWidth(100);

        TextArea fahrenheit = new TextArea();
        fahrenheit.setMaxHeight(1);
        fahrenheit.setMaxWidth(100);

        Button c_to_f = new Button("Celsius zu Fahrenheit");
        Button f_to_c = new Button("Fahrenheit zu Celsius");

        javafx.event.EventHandler<MouseEvent> btn_c_to_f = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e)
                {

                }
            };

        javafx.event.EventHandler<MouseEvent> btn_f_to_c = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e)
            {

            }
        };


        root.getChildren().add(celsiusText);
        root.getChildren().add(celsius);

        root.getChildren().add(fahrenheitText);
        root.getChildren().add(fahrenheit);

        root.getChildren().add(c_to_f);
        root.getChildren().add(f_to_c);

        Scene scene = new Scene(root, 200, 200);
        stage.setTitle("Memory");
        stage.setScene(scene);
        stage.show();
    }
}
