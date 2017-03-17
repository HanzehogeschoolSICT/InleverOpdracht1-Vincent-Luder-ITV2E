package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.Model;

/**
 * Created by Niek on 17-3-2017.
 */
public class Controller {
    @FXML private Button sortButton;
    @FXML private Button autoButton;
    @FXML private Button resetButton;
    @FXML private HBox rectanglePane;
    @FXML private Pane rootPane;
    @FXML private RadioButton bubbleRadio;
    @FXML private RadioButton insertRadio;
    @FXML private RadioButton quickRadio;
    @FXML private RadioButton mergeRadio;
    @FXML private ToggleGroup group;
    @FXML private Label statusLabel;

    private Model model = new Model();

    public Controller(){}

    @FXML
    private void initialize(){
        model.generate();
        addRectangle(rectanglePane);
    }

    @FXML
    private void startSort(){
        if(bubbleRadio.isSelected()){
            model.bubbleSortStep(false);
            regenerate();
        }
        if(insertRadio.isSelected()){
            model.insertionSortStep(false);
            regenerate();
        }
        if(quickRadio.isSelected()){
            model.quickSortStep(false);
            regenerate();
        }
        if(mergeRadio.isSelected()){
            model.mergeSortStep(false);
            regenerate();
        }
        System.out.println("step");
    }

    @FXML
    private void startAutoSort(){
        if(bubbleRadio.isSelected()){
            model.bubbleSortStep(true);
            regenerate();
        }
        if(insertRadio.isSelected()){
            model.insertionSortStep(true);
            regenerate();
        }
        if(quickRadio.isSelected()){
            model.quickSortStep(true);
            regenerate();
        }
        if(mergeRadio.isSelected()){
            model.mergeSortStep(true);
            regenerate();
        }
    }

    @FXML
    private void doReset(){
        model.resetCount(false);
        model.generate();
        regenerate();
    }

    private Rectangle createRectangle(int lengte){
        Rectangle rectangle = new Rectangle(100,50,10,lengte*15);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    private void addRectangle(HBox pane){
        //this.rectanglePane = pane;
        for(int rectangle: model.getArray()){
            pane.getChildren().add(createRectangle(rectangle));
        }
    }

    private void regenerate(){
        if(model.getStatus()){
            statusLabel.setText("The array is sorted");
        }
        else{
            statusLabel.setText("The array is not sorted");
        }
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

}
