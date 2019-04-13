package com.simulation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;

public class forces extends Application {
    ImageView mSpring;

    @Override
    public void init() throws Exception {
        super.init();

        Image image = new Image(getClass().getResource("Sprezyna.png").toString());

        mSpring = new ImageView(image);
        mSpring.setFitWidth(200);
        mSpring.setFitHeight(200);
        mSpring.setPreserveRatio(true);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        Scene scene = new Scene(group,640,480);


        group.getChildren().add(mSpring);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
