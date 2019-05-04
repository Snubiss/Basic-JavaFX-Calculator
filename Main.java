/********************************************************************
//  Main.java       Author: Snubiss
//
//  Date: March 17, 2019
//  Modified: March 19, 2019
//
//  Purpose:
//  The purpose of this application is provide the user with a working
//  calculator. The calculator can carry out basic tasks, such as addition
//  subtraction, multiplication and division. The calculator allows input
//  from the user by keyboard, by click and by direct input being typed 
//  into the text fields. If a calculation is higher then 9999999999 then
//  the calculator will display an error message to the user.
//
//********************************************************************/

package basiccalculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create a calculator.
        Calculator calc = new Calculator();
        
        // Prep the background Pane.
        VBox mainPain = new VBox();
        mainPain.getChildren().addAll(calc.getCalculator());
        mainPain.setAlignment(Pos.CENTER);
        mainPain.setStyle("-fx-background-color: #2f2f2f");
        
        // Prep the Scene.
        Scene scene = new Scene(mainPain, 600, 680);
        calc.addKeyBindings(scene);
        
        // Prep the Stage.
        primaryStage.setTitle("Snub's Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
