package Java_Assignment;

// Libraries for UI controls
import javafx.scene.control.ComboBox;   // For the Genre and Registered dropdowns
import javafx.scene.control.Label;      // Better than 'Text' for form labels
import javafx.scene.control.Button;     // For Save and Remove
import javafx.scene.control.TextField;  // For the Movie Name input

// Logic and data libraries
import javafx.collections.FXCollections; // Tools to create the lists
import javafx.collections.ObservableList; // A list that updates the UI automatically
import java.util.HashMap;                 // To link Genre Names -> Movie Lists
import java.util.Map;                     // The interface for the HashMap

// Libraries for grid placements
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;



public class Assignmentfx extends Application {
    // A simple movie dialogue containing genres, names and if it is registered
    Label Lblgenre = new Label("Genres: "); // Genre name
    Label Name = new Label("Name: ");
    Label Lblreg = new Label("Registered: ");
    Button Save = new Button("Save movie");
    Button Remove = new Button("Remove movie");
    TextField txtname = new TextField();
    ComboBox<String> Genre = new ComboBox<>();
    ComboBox<String> Registered = new ComboBox<>();
    GridPane gridPane = new GridPane();
    Map<String, ObservableList<String>> movieData = new HashMap<>();

    @Override
    public void start(Stage stage) throws Exception {
        //Grid layout configs
        gridPane.setMinSize(400, 350);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));

        // Initialize the Dropdowns
        String[] genreList = {"Action", "Comedy", "Sci-Fi", "Drama"};
        Genre.getItems().addAll(genreList);

        // Create an empty list for each genre in the HashMap
        for (String g : genreList) {
            movieData.put(g, FXCollections.observableArrayList());
        }

        //Adding components to the layout
        gridPane.add(Lblgenre, 0, 0);
        gridPane.add(Genre, 1, 0);

        gridPane.add(Name, 0 , 1);
        gridPane.add(txtname, 1, 1);
        gridPane.add(Save, 1, 2);

        gridPane.add(Lblreg, 0, 3);
        gridPane.add(Registered, 1, 3);
        gridPane.add(Remove, 1, 4);

        // Set Button Widths (Optional: makes it look like the picture)
        Registered.setMaxWidth(Double.MAX_VALUE);
        Genre.setMaxWidth(Double.MAX_VALUE);
        Save.setMaxWidth(Double.MAX_VALUE);
        Remove.setMaxWidth(Double.MAX_VALUE);

        // creating the scene
        Scene scene = new Scene(gridPane);
        // Stage title
        stage.setTitle("Movie Manager");

        // Attaching to the scene
        stage.setScene(scene);
        // making the stage visible
        stage.show();

        // When a genre is picked, tell the registered dropdown to show the movies in that genre
        Genre.setOnAction(e -> {
            String selected = Genre.getValue();
            if (selected != null) {
                Registered.setItems(movieData.get(selected));
            }
        });

        // Save button logic
        Save.setOnAction(e -> {
            String genre = Genre.getValue();
            String name = txtname.getText();
            if (genre != null && !name.isEmpty()) {
                movieData.get(genre).add(name);
                txtname.clear(); // Clear the input after saving
            } else {
                System.out.println("Please select a genre and enter a movie name.");
            }
        });

        // Remove button logic
        Remove.setOnAction(e -> {
            String genre = Genre.getValue();
            String name = Registered.getValue();
            if (genre != null && name != null) {
                movieData.get(genre).remove(name);
                Registered.getSelectionModel().clearSelection(); // Clear the selection after removing
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
