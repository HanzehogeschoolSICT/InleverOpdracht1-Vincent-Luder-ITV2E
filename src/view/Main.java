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

/**
 * View gemaakt met Gluon Scenebuilder
 */
public class Main extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        String fxmlDocPath = "C:\\Users\\Niek\\IdeaProjects\\InleverOpdracht1-Vincent-Luder-Niek-Beukema-ITV2E\\src\\layout.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
        Pane rootPane = loader.load(fxmlStream);
        Scene scene = new Scene(rootPane);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}