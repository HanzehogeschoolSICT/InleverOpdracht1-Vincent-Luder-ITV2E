import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.ArrayFiller;
import model.Compare;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class SortApp extends Application {
    ArrayList<Compare> array = new ArrayList<>();
    ArrayFiller filler = new ArrayFiller();

    Compare compare;




    public Rectangle createRectangle(int lengte){

        Rectangle rectangle = new Rectangle(100,10,50,lengte*10);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    public void addRectangle(HBox pane){
        for(Compare rectangle: array){
            pane.getChildren().add(createRectangle(rectangle.getValue()));
        }
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        filler.fillArray(10,array);
        HBox pane = new HBox();

        addRectangle(pane);


        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(200);
        primaryStage.show();


    }
}
