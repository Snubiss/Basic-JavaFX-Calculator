/********************************************************************
//  Calculator.java       Author: Snubiss
//
//  Date: March 17, 2019
//  Modified: March 19, 2019
//
//  Defines the instance data, constructors and associated
//  methods of a calculator class object. Creates a calculator
//  upon being invoked. This uses extensive amounts of JavaFX to
//  produce the GUI.
//
//********************************************************************/

package basiccalculator;

import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Calculator {
    
    TextField bigText = new TextField();
    TextField A = new TextField();
    TextField action = new TextField();;
    TextField B = new TextField();;
    Label equals = new Label();
    TextField answer = new TextField();;
    VBox calcWindow;
    Button[][] button = new Button[4][4];
    GridPane buttonGrid = new GridPane();
    String[] buttonText = {"7","4","1","CLR","8","5","2","0","9","6","3","=","+","-","x","/"};
    
    Calculator(){
        
        bigText.setText("0");
        initiateListeners();
        this.calcWindow = (VBox)getCalcWindow();
    }
    
    public VBox getCalculator(){
        return calcWindow;
    }
    
    // CREATE THE CALCULATOR BOX FRAME.
    private Pane getCalcWindow(){
        calcWindow = new VBox();
        calcWindow.setMaxWidth(401);
        calcWindow.setMinWidth(401);
        calcWindow.setMaxHeight(594);
        calcWindow.setMinHeight(594);
        calcWindow.setStyle("-fx-background-color: #3f3f3f;" +
                            "-fx-border-color: grey;" +
                            "-fx-border-width: 1;" +
                            "-fx-border-radius: 5 5 5 5;" +
                            "-fx-background-radius: 5 5 5 5;" +
                            "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
        calcWindow.getChildren().addAll(textFieldLabels(), textFieldBoxes(), bigTextField(), buttonLayout());
        //calcWindow.setAlignment(Pos.CENTER);
    return calcWindow;
    }
    
    // CREATE THE LABELS ABOVE THE TEXTFIELDS.
    private Pane textFieldLabels(){
        
        Label firstNumber = new Label();
        firstNumber.setText("A");
        firstNumber.setFont(new Font(15));
        firstNumber.setMaxSize(66, 20);
        firstNumber.setMinSize(66, 20);
        firstNumber.setStyle("-fx-text-fill: orange;");
        firstNumber.setAlignment(Pos.CENTER);
        
        Label actionLabel = new Label();
        actionLabel.setText("?");
        actionLabel.setFont(new Font(15));
        actionLabel.setMaxSize(70, 20);
        actionLabel.setMinSize(70, 20);
        actionLabel.setStyle("-fx-text-fill: orange;");
        actionLabel.setAlignment(Pos.CENTER);
        
        Label secondNumber = new Label();
        secondNumber.setText("B");
        secondNumber.setFont(new Font(15));
        secondNumber.setMaxSize(70, 20);
        secondNumber.setMinSize(70, 20);
        secondNumber.setStyle("-fx-text-fill: orange;");
        secondNumber.setAlignment(Pos.CENTER);
        
        Label answerLabel = new Label();
        answerLabel.setText("Answer");
        answerLabel.setFont(new Font(15));
        answerLabel.setMaxSize(120, 20);
        answerLabel.setMinSize(120, 20);
        answerLabel.setStyle("-fx-text-fill: orange;");
        answerLabel.setAlignment(Pos.CENTER_RIGHT);
        
        
        HBox textFieldLabels = new HBox();
        textFieldLabels.setPadding(new Insets(20,0,0,20));
        textFieldLabels.setSpacing(10);
        textFieldLabels.getChildren().addAll(firstNumber, actionLabel, secondNumber, answerLabel);
    return textFieldLabels;
    }
    
    // CREATE THE TEXTFIELD BOXES.
    private Pane textFieldBoxes(){
        
        A.setMaxSize(80, 40);
        A.setMinSize(80, 40);
        A.setAlignment(Pos.CENTER);
        
        action.setMaxSize(40, 40);
        action.setMinSize(40, 40);
        action.setAlignment(Pos.CENTER);
        
        B.setMaxSize(80, 40);
        B.setMinSize(80, 40);
        B.setAlignment(Pos.CENTER);
        
        equals.setText("=");
        equals.setFont(new Font(27));
        equals.setStyle("-fx-text-fill: orange;");
        
        answer.setMaxSize(80, 40);
        answer.setMinSize(80, 40);
        answer.setAlignment(Pos.CENTER);
        
        
        HBox textBox = new HBox();
        textBox.getChildren().addAll(A, action, B, equals, answer);
        textBox.setPadding(new Insets(10, 0, 0, 2));
        textBox.setSpacing(20);
        textBox.setAlignment(Pos.CENTER);
    return textBox;
    }
    
    // CREATE THE BIGTEXTFIELD BOX.
    private Pane bigTextField(){
        
        bigText.setAlignment(Pos.CENTER_RIGHT);
        bigText.setFont(new Font(70));
        bigText.setPadding(new Insets(0,10,0,0));
        bigText.setMaxSize(399, 100);
        bigText.setMinSize(399, 100);
        
        
        HBox bigTextBox = new HBox();
        bigTextBox.setMaxSize(399, 100);
        bigTextBox.setMinSize(399, 100);
        bigTextBox.setPadding(new Insets(25, 0, 0, 0));
        bigTextBox.getChildren().add(bigText);
        bigTextBox.setAlignment(Pos.CENTER);
    return bigTextBox;
    }
    
    // CREATE THE BUTTON GRID AND BUTTONS FOR THE CALCULATOR.
    private Pane buttonLayout(){
        
        int textCounter = 0;
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                
                button[i][j] = new Button();
                button[i][j].setText(buttonText[textCounter]);
                button[i][j].setFont(new Font(20));
                button[i][j].setMinSize(95+5, 95);
                button[i][j].setMaxSize(95+5, 95);
                buttonGrid.add(button[i][j], i, j);
                textCounter++;
            }
        }
        buttonGrid.setAlignment(Pos.BOTTOM_CENTER);
        buttonGrid.setPadding(new Insets(21, 0, 0, 0));
    return buttonGrid;    
    }
    
    // Add listeners to disallow the user to extend numbers out of bounds.
    private void initiateListeners(){
        
        bigText.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                // Check if the new character is greater than LIMIT
                if (bigText.getText().length() >= 10) {
                    bigText.setText(bigText.getText().substring(0, 10));
                }
            }
        });
        
        A.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                // Check if the new character is greater than LIMIT
                if (A.getText().length() >= 10) {
                    A.setText(A.getText().substring(0, 10));
                }
            }
        });
        
        B.lengthProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            if (newValue.intValue() > oldValue.intValue()) {
                // Check if the new character is greater than LIMIT
                if (B.getText().length() >= 10) {
                    B.setText(B.getText().substring(0, 10));
                }
            }
        });
    }
    
    // APPLY THE MOUSE AND KEYBOARD ACTIONS TO OUR CALCULATOR.
    public void addKeyBindings(Scene scene){
        
        /////////////////////////////////////////
        //                                     //
        //           CLICK CONTROLS            //
        //                                     //
        /////////////////////////////////////////
        
        LogicEvents logicanator = new LogicEvents();
        
        button[0][2].setOnAction(logicanator.event1(this));
        button[1][2].setOnAction(logicanator.event2(this));
        button[2][2].setOnAction(logicanator.event3(this));
        button[3][2].setOnAction(logicanator.eventMultiply(this));
        button[0][1].setOnAction(logicanator.event4(this));
        button[1][1].setOnAction(logicanator.event5(this));
        button[2][1].setOnAction(logicanator.event6(this));
        button[3][1].setOnAction(logicanator.eventMinus(this));
        button[0][0].setOnAction(logicanator.event7(this));
        button[1][0].setOnAction(logicanator.event8(this));
        button[2][0].setOnAction(logicanator.event9(this));
        button[3][0].setOnAction(logicanator.eventPlus(this));
        button[0][3].setOnAction(logicanator.eventClear(this));
        button[1][3].setOnAction(logicanator.event0(this));
        button[2][3].setOnAction(logicanator.eventEquals(this));
        button[3][3].setOnAction(logicanator.eventDivide(this));
        
        /////////////////////////////////////////
        //                                     //
        //         KEYBOARD CONTROLS           //
        //                                     //
        /////////////////////////////////////////
        
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.DIGIT1 || e.getCode() == KeyCode.NUMPAD1){
                button[0][2].fire();
            }
            if (e.getCode() == KeyCode.DIGIT2 || e.getCode() == KeyCode.NUMPAD2){
                button[1][2].fire();
            }
            if (e.getCode() == KeyCode.DIGIT3 || e.getCode() == KeyCode.NUMPAD3){
                button[2][2].fire();
            }
            if (e.getCode() == KeyCode.DIGIT4 || e.getCode() == KeyCode.NUMPAD4){
                button[0][1].fire();
            }
            if (e.getCode() == KeyCode.DIGIT5 || e.getCode() == KeyCode.NUMPAD5){
                button[1][1].fire();
            }
            if (e.getCode() == KeyCode.DIGIT6 || e.getCode() == KeyCode.NUMPAD6){
                button[2][1].fire();
            }
            if (e.getCode() == KeyCode.DIGIT7 || e.getCode() == KeyCode.NUMPAD7){
                button[0][0].fire();
            }
            if (e.getCode() == KeyCode.DIGIT8 || e.getCode() == KeyCode.NUMPAD8){
                button[1][0].fire();
            }
            if (e.getCode() == KeyCode.DIGIT9 || e.getCode() == KeyCode.NUMPAD9){
                button[2][0].fire();
            }
            if (e.getCode() == KeyCode.DIGIT0 || e.getCode() == KeyCode.NUMPAD0){
                button[1][3].fire();
            }
            if (e.getCode() == KeyCode.ADD || e.getCode() == KeyCode.PLUS){
                button[3][0].fire();
            }
            if (e.getCode() == KeyCode.SUBTRACT) {
                button[3][1].fire();
            }
            if (e.getCode() == KeyCode.DIVIDE || e.getCode() == KeyCode.SLASH) {
                button[3][3].fire();
            }
            if (e.getCode() == KeyCode.MULTIPLY || e.getCode() == KeyCode.X) {
                button[3][2].fire();
            }
            if (e.getCode() == KeyCode.ESCAPE || e.getCode() == KeyCode.SPACE) {
                button[0][3].fire();
            }
            if (e.getCode() == KeyCode.ENTER) {
                button[2][3].fire();
            }
            if (e.getCode() == KeyCode.BACK_SPACE) {
                if (logicanator.cursor == 0 && bigText.getText() != null){
                    try{
                        int length = bigText.getLength();
                        bigText.setText(bigText.getText().substring(0,length-1));
                        A.setText(bigText.getText());
                    }
                    catch(StringIndexOutOfBoundsException ex){
                        
                    }
                }
                if (logicanator.cursor == 1 && bigText.getText() != null){
                    try{
                        int length = bigText.getLength();
                        bigText.setText(bigText.getText().substring(0,length-1));
                        B.setText(bigText.getText());
                    }
                    catch(StringIndexOutOfBoundsException ex){
                        
                    }
                }
            }
        });
        
        // Remove the default prompt from all textareas
        equals.requestFocus();
    }
}
