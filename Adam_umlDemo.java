/* * * * * * * * * * * * * * * * * * * * * *\
*   Program: Adam_umlDemo
*   Author: Adam Omar
*   Description: TTest code for actual uml editor
*
\* * * * * * * * * * * * * * * * * * * * * */

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape;

import javafx.stage.Stage;


//  Terms:
//  The window == Stage
//  The content inside window == Scene

public class MyFxApp extends Application {
    @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("My JavaFX App");

            button = new Button();
            button.setText("Click Me");
//lamba expressions
//e == event; Works for one liners
//Multiple: e-> { 
//              System.out.println("Wow")
//              System.out.println("Cooli~") }

            
            button.setOnAction(e -> System.out.println("Eyah! Senpai~"));

            StackPane layout = new StackPane();
            layout.getChildren().add(button);

            Scene scene = new Scene(layout, 300, 250);

            primaryStage.setScene(scene);
            primaryStage.show();
    }

    Button button;

    public static void main(String[] args) {
        launch(args);

        
    }

}