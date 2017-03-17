package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ArrayFiller;
import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application{



    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        String fxmlDocPath = "/home/niek/Bureaublad/Nieksort/src/layout.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        Pane rootPane = loader.load(fxmlStream);
        Scene scene = new Scene(rootPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sorteren van Niek");
        primaryStage.show();
    }
}