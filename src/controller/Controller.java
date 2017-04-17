package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.Model;

public class Controller {
    @FXML
    private Button sortButton;
    @FXML
    private Button autoButton;
    @FXML
    private Button resetButton;
    @FXML
    private HBox rectanglePane;
    @FXML
    private Pane rootPane;
    @FXML
    private RadioButton bubbleRadio;
    @FXML
    private RadioButton insertRadio;
    @FXML
    private RadioButton quickRadio;
    @FXML
    private RadioButton mergeRadio;
    @FXML
    private ToggleGroup group;
    @FXML
    private Label statusLabel;
    @FXML
    private Slider slider;

    private Model model = new Model();

    public Controller() {
    }

    @FXML
    private void initialize() {
        model.generate();
        addRectangle(rectanglePane);
    }

    @FXML
    private void startSort() {
        runSort();
        regenerate();
    }

    private void runSort() {
        if (bubbleRadio.isSelected()) {
            model.bubbleSortStep();
        } else if (insertRadio.isSelected()) {
            model.insertionSortStep();
        } else if (quickRadio.isSelected()) {
            model.quickSortStep();
        } else if (mergeRadio.isSelected()) {
            model.mergeSortStep();
        }
    }

    @FXML
    private void startAutoSort() {
        boolean running = true;
        new Thread(() -> {
            while (running) {
                if (model.getStatus()) {
                    break;
                }
                runSort();
                Platform.runLater(() -> regenerate());
                try {
                    Thread.sleep(((long) slider.getValue()));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }).start();
    }

    @FXML
    private void doReset() {
        model.resetCount(false);
        model.generate();
        regenerate();
    }

    private Rectangle createRectangle(int lengte) {
        Rectangle rectangle = new Rectangle(100, 50, 10, lengte * 15);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }

    private void addRectangle(HBox pane) {
        for (int rectangle : model.getArray()) {
            pane.getChildren().add(createRectangle(rectangle));
        }
    }

    private void regenerate() {
        if (model.getStatus()) {
            statusLabel.setText("Klaar met sorteren!");
        } else {
            statusLabel.setText("Niet gesorteerd!");
        }
        rectanglePane.getChildren().clear();
        addRectangle(rectanglePane);
    }

}
