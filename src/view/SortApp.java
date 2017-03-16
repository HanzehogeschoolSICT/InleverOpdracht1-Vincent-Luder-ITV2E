package view;
import controller.BubbleSort;
import controller.InsertionSort;
import controller.QuickSort;
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
import javafx.scene.layout.Pane;
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

    private int arrayLimit = 10;

    private int[] array = new int[arrayLimit];
    private ArrayFiller filler = new ArrayFiller();
    private Button sortButton = new Button();
    private Button autoButton = new Button();
    private Button resetButton = new Button();
    private Pane pane = new Pane();
    private HBox rectanglePane = new HBox();

    private RadioButton bubblesorRadio = new RadioButton("BubbleSort");
    private RadioButton insertionRadio = new RadioButton("InsertionSort");
    private RadioButton quickRadio = new RadioButton("Quicksort");
    //HBox knopjes = new HBox();

    private BubbleSort sorter = new BubbleSort();
    private InsertionSort insertionSorter = new InsertionSort();
    private QuickSort quicksorter = new QuickSort();

    private Rectangle createRectangle(int lengte){

        Rectangle rectangle = new Rectangle(100,10,10,lengte*15);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    private void addRectangle(HBox pane){
        this.rectanglePane = pane;
        for(int rectangle: array){
            pane.getChildren().add(createRectangle(rectangle));
        }
    }

    private void bubbleSortStep(boolean isAuto){
        //pane.requestLayout();
        if(isAuto){
            sorter.autoSort(array);
        }
        else{
            sorter.sortArray(array);
        }

        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    private void insertionSortStep(){
        //pane.requestLayout();
        insertionSorter.insertionSort(array);
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    private void QuickSortStep(){
        //pane.requestLayout();
        quicksorter.quickSort(array);
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

    private void reset(HBox pane){
        sorter.resetCount(false);
        this.rectanglePane =pane;
        pane.getChildren().clear();
        filler.fillArray(arrayLimit,array);
        addRectangle(pane);


    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        //fill the array with ten Compare objects
        filler.fillArray(arrayLimit,array);

        pane.setPrefHeight(500);
        pane.setPrefWidth(1000);
        rectanglePane.setPrefWidth(650);
        rectanglePane.setPrefHeight(500);
        rectanglePane.setLayoutX(12);
        rectanglePane.setLayoutY(6);
        autoButton.setLayoutX(713);
        autoButton.setLayoutY(24);
        sortButton.setLayoutX(713);
        sortButton.setLayoutY(53);
        resetButton.setLayoutY(81);
        resetButton.setLayoutX(713);

        quickRadio.setLayoutX(816);
        quickRadio.setLayoutY(16);
        bubblesorRadio.setLayoutX(816);
        bubblesorRadio.setLayoutY(41);
        insertionRadio.setLayoutX(816);
        insertionRadio.setLayoutY(70);

        //pane.setAlignment(Pos.TOP_CENTER);
        rectanglePane.setAlignment(Pos.BOTTOM_CENTER);

        sortButton.setText("Sorteer");
        autoButton.setText("Auto Sort");
        resetButton.setText("Reset");

        pane.getChildren().add(rectanglePane);
        pane.getChildren().add(sortButton);
        pane.getChildren().add(autoButton);
        pane.getChildren().add(resetButton);

        pane.getChildren().addAll(bubblesorRadio,insertionRadio,quickRadio);
        ToggleGroup group = new ToggleGroup();
        bubblesorRadio.setToggleGroup(group);
        insertionRadio.setToggleGroup(group);
        quickRadio.setToggleGroup(group);


        addRectangle(rectanglePane);


        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        //primaryStage.setWidth(800);
        //primaryStage.setHeight(300);
        primaryStage.show();



        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                resetButton.setOnAction(event -> reset(rectanglePane));

                group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
                    public void changed(ObservableValue<? extends Toggle> ov,
                                        Toggle old_toggle, Toggle new_toggle) {
                        if(bubblesorRadio.isSelected()){
                            sortButton.setOnAction(event -> bubbleSortStep(false));
                            autoButton.setOnAction(event -> bubbleSortStep(true));
                        }
                        if(insertionRadio.isSelected()){
                            sortButton.setOnAction(event -> insertionSortStep());
                        }
                        if(quickRadio.isSelected()){
                            sortButton.setOnAction(event -> QuickSortStep());
                        }

                    }
                });
            }
        });


    }


}