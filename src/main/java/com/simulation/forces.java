package com.simulation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class forces extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        Scene scene = new Scene(group,640,480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}