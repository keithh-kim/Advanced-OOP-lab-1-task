package Javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;


public class Simplefx extends Application {
    // A simple dialog with a button and a textbox
    Text LblMsg = new Text("Welcome to OOP 2");
    Text Name = new Text("Name: ");
    TextField txtname = new TextField();
    Button btnOk = new Button("OK");
    GridPane gridPane = new GridPane();



    @Override
    public void start(Stage stage) throws Exception {
        // Gridlayout configs
        // import javafx.geometry.Pos;
        // import java.fx.geometry.Insets;
        gridPane.setMinSize(400, 200);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Adding components to the layout
        gridPane.add(LblMsg, 1, 0);
        gridPane.add(Name, 0, 1);
        gridPane.add(txtname, 1, 1);
        gridPane.add(btnOk, 0, 2);

        // Creating the scene
        // import javafx.scene.Scene
        Scene scene = new Scene(gridPane);

        // Configure Scene
        stage.setTitle("OOP II E");
        stage.setScene(scene);

        stage.show();

        // Event handling
        // javafx.scene.input.MouseEvent
        // javafx.event.EventHandler
        btnOk.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String name = txtname.getText();
                String msg = "Hi "+name+", welcome to OOP II";
                LblMsg.setText(msg);

            }
        });
    }


    public static void main(String[] args) {
        launch(args);

    }
}
