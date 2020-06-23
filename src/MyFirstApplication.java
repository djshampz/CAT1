import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MyFirstApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.DECORATED);

        VBox parent = new VBox();
        parent.setId("pane");

        Label text = new Label("Name");
        Label text1 = new Label("Age");
        Label text2 = new Label("Email");
        Label text3 = new Label("Password");
        Label text4 = new Label("Confirm Password");
        Label text5 = new Label("REGISTER");

        TextField textField = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField2 = new TextField();

        PasswordField passwordField = new PasswordField();
        PasswordField passwordField1 = new PasswordField();

        ImageView imageView = new ImageView("resources/icons8-battle.net-50.png");
        ImageView imageView1 = new ImageView("resources/icons8-door-sensor-error-50.png");

        Button button = new Button("Register", imageView);
        Button button1 = new Button("Cancel", imageView1);

        button.setOnAction(e -> {
            text5.setText("WELCOME TO THE MATRIX");
        });
        button1.setOnAction((e -> {
            text5.setText("SO YOU HAVE CHOSEN THE BLUE PILL");
        }));

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10,10,10));

        gridPane.setVgap(8);
        gridPane.setHgap(8);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(100,100,100,100));

        gridPane.add(text, 0,0);
        gridPane.add(textField, 1,0);
        gridPane.add(text1, 0,2);
        gridPane.add(datePicker, 1,2);
        gridPane.add(text2,0,4);
        gridPane.add(textField2, 1,4);
        gridPane.add(text3,0,6);
        gridPane.add(passwordField, 1,6);
        gridPane.add(text4, 0,8);
        gridPane.add(passwordField1, 1,8);
        gridPane.add(button,0,15);
        gridPane.add(button1, 1,15);

        parent.getChildren().addAll(gridPane, text5);

        Scene scene = new Scene(parent);
        scene.getStylesheets().addAll(this.getClass().getResource("styles/matrix.css").toExternalForm());

        stage.setTitle("Matrix Entertainments");
        stage.setWidth(800);
        stage.setHeight(500);
        stage.setScene(scene);
        stage.show();
    }
}
