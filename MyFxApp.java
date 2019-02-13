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
import javafx.scene.shape.Shape;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;
/////////////////////////////////////////////////////////////////
//  Terms:
//  The window == Stage
//  The content inside window == Scene
/////////////////////////////////////////////////////////////////

public class MyFxApp extends Application {

Stage window;
Scene scene1, scene2;

/////////////////////////////////////////////////////////////////
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage;

        Label label1 = new Label("First Scene");

        //Button 1
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e-> window.setScene(scene2));


        //Layout 1 - Childern are laid out vertically
        VBox layout1 = new VBox(20);
        //.add() for one item & addAll() for multiple items
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

    //-------------------------------------------------------

        //Button 2
        Button button2 = new Button("Why are you here, go back to Scene 1");
        button2.setOnAction(e-> window.setScene(scene1));


        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 200);


        window.setScene(scene1);
        window.setTitle("Title here");
        window.show();


/*
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
*/
    }

    
/////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        launch(args);

        
    }

}