package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @ author Fei Gu
 * @ create 2021-04-13-09.40
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description
 * @ Version
 */
public class JavaFXQ7 extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Calculator");

        TextField textField1 = new TextField();
        textField1.setLayoutX(100);
        textField1.setLayoutX(2);

        Label label1 = new Label("+");
        TextField textField2 = new TextField();

        String result = textField1.getText() + textField2.getText();
        Label label2 = new Label("=");



        Label label3 = new Label();

        HBox hBox = new HBox(textField1, label1, textField2, label2,label3);
        hBox.setLayoutX(2);
        hBox.setLayoutY(30);

        Pane pane = new Pane(label,hBox);
        Scene scene = new Scene(pane,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }
}
