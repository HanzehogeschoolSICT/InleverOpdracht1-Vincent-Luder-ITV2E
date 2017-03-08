import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class SortApp extends Application {
    ArrayList<Compare> array = new ArrayList<>();


    Compare compare;



    public void fillArray(int limit){
        for(int i = 0; i < limit; i++ ){
            this.compare = new Compare();
            array.add(compare);
        }
    }

    public Rectangle createRectangle(int lengte){

        Rectangle rectangle = new Rectangle(100,10,50,lengte*10);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        fillArray(10);
        TilePane pane = new TilePane();

        for(Compare rectangle: array){
            pane.getChildren().add(createRectangle(rectangle.getValue()));
        }


        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(200);
        primaryStage.show();


    }
}
