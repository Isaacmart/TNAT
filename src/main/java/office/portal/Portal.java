package office.portal;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class Portal extends Application{
    
    public void start(Stage stage){

        ObservableList<String> names = FXCollections.observableArrayList(
            "juan", "luis", "elias", "juan", "juan", "juan", "juan", "juan", 
            "juan", "juan", "juan", "juan", "juan", "juan", "juan", "juan");
        ListView<String> listview = new ListView<>(names);

        HBox root = new HBox(listview);

        Scene scene = new Scene(root);

        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        stage.setScene(scene);
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setTitle("TNAT");
        stage.show();
    }
}
