package view;
import controller.BubbleSort;
import controller.InsertionSort;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Toggle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.ArrayFiller;
import model.Compare;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;

/**
 * Created by Gebruiker on 8-3-2017.
 */
public class SortApp extends Application {
    int[] array = new int[20];
    ArrayFiller filler = new ArrayFiller();
    Button sortButton = new Button();
    HBox pane = new HBox();
    HBox rectanglePane = new HBox();

    RadioButton bubblesorRadio = new RadioButton("BubbleSort");
    RadioButton insertionRadio = new RadioButton("InsertionSort");
    //HBox knopjes = new HBox();

    ArrayList<Compare[]> arrayList = new ArrayList<>();
    BubbleSort sorter = new BubbleSort();
    InsertionSort insertionSorter = new InsertionSort();

    public Rectangle createRectangle(int lengte){

        Rectangle rectangle = new Rectangle(100,10,20,lengte*15);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    public void addRectangle(HBox pane){
        this.rectanglePane = pane;
        for(int rectangle: array){
            pane.getChildren().add(createRectangle(rectangle));
        }
    }

    public void bubbleSortStep(){
        //pane.requestLayout();
        sorter.sortArray(array);
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    public void insertionSortStep(){
        //pane.requestLayout();
        insertionSorter.insertionSort(array);
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
        filler.fillArray(20,array);



        pane.setAlignment(Pos.TOP_CENTER);
        rectanglePane.setAlignment(Pos.BOTTOM_CENTER);

        sortButton.setText("sort");

        pane.getChildren().add(rectanglePane);
        pane.getChildren().add(sortButton);

        pane.getChildren().addAll(bubblesorRadio,insertionRadio);
        ToggleGroup group = new ToggleGroup();
        bubblesorRadio.setToggleGroup(group);
        insertionRadio.setToggleGroup(group);


        addRectangle(rectanglePane);


        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(300);
        primaryStage.show();



        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
                    public void changed(ObservableValue<? extends Toggle> ov,
                                        Toggle old_toggle, Toggle new_toggle) {
                        if(bubblesorRadio.isSelected()){
                            sortButton.setOnAction(event -> bubbleSortStep());
                        }
                        if(insertionRadio.isSelected()){
                            sortButton.setOnAction(event -> insertionSortStep());
                        }

                    }
                });
            }
        });


    }


}