package view;
import controller.BubbleSort;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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
    BubbleSort bubbleSort = new BubbleSort();
    Compare[] compareArray = new Compare[10];
    Compare[] array = new Compare[10];
    ArrayFiller filler = new ArrayFiller();
    Button sortButton = new Button();
    HBox pane = new HBox();
    HBox rectanglePane = new HBox();
    //HBox knopjes = new HBox();

    ArrayList<Compare[]> arrayList = new ArrayList<>();
    BubbleSort sorter = new BubbleSort();


    public Rectangle createRectangle(int lengte){

        Rectangle rectangle = new Rectangle(100,10,50,lengte*10);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    public void addRectangle(HBox pane){
        this.rectanglePane = pane;
        for(Compare rectangle: array){
            pane.getChildren().add(createRectangle(rectangle.getValue()));
        }
    }

    public void step(){
        //pane.requestLayout();
        sorter.sortArray(array);
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    void test(HBox pane){
        System.out.println("test");
        pane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //fill the array with ten Compare objects
        filler.fillArray(10,array);



        pane.setAlignment(Pos.TOP_CENTER);
        rectanglePane.setAlignment(Pos.BOTTOM_CENTER);

        sortButton.setText("sort");

        pane.getChildren().add(rectanglePane);
        pane.getChildren().add(sortButton);
        addRectangle(rectanglePane);


        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(300);
        primaryStage.show();


        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                sortButton.setOnAction(event -> step());


            }
        });


    }


}